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

public class ThreadMemDemoB {

    static Logger logger = LoggerFactory.getLogger(ThreadMemDemoB.class);


    public static void main(String[] args) {
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
            });
            completableFutureList.add(completableFuture);
            logger.info("cList size {}", completableFutureList.size());
        });

        Thread.State state = Thread.currentThread().getState();
        logger.info("state {}", state);

    }
}
