package com.wandou.bull.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author liming
 * @date 2021/11/19 下午8:55
 */

public class ThreadMemDemo {

    static Logger logger = LoggerFactory.getLogger(ThreadMemDemo.class);

    static ThreadPoolTaskExecutor threadPoolExecutor;


    public static void main(String[] args) {
        threadPoolExecutor = newExecutor(4, 8, 1, "threadPool");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            list.add(i);
        }

        List<CompletableFuture<Integer>> completableFutureList = new ArrayList<>();
        list.stream().forEach(integer -> {
            CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
                logger.info("integer {}", integer);
                Integer target = 0;
                if (integer > 10) {
                    target = integer * integer;
                } else {
                    target = integer + integer;
                }
                return target;
            }, threadPoolExecutor);
            completableFutureList.add(completableFuture);
            logger.info("cList size {}", completableFutureList.size());
        });

        Thread.State state = Thread.currentThread().getState();
        logger.info("state {}", state);
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        state = Thread.currentThread().getState();
        logger.info("state {}", state);

        state = Thread.currentThread().getState();
        logger.info("state {}", state);

    }


    private static ThreadPoolTaskExecutor newExecutor(int coreSize, int maxSize, int queueCapacity, String name) {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(coreSize);
        taskExecutor.setMaxPoolSize(maxSize);
        taskExecutor.setQueueCapacity(queueCapacity);
        taskExecutor.setThreadNamePrefix(String.format("%s_", name));
//        taskExecutor.setTaskDecorator();
        taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        taskExecutor.initialize();
        return taskExecutor;
    }


    public static class BullRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("run ...");
            int maxPoolSize = threadPoolExecutor.getMaxPoolSize();
            System.out.println("maxPoolSize = " + maxPoolSize);
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
