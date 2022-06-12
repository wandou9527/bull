package com.wandou.bull.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author liming
 * @date 2020/11/25
 * @description
 */
public class Demo {

    private static final Logger logger = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) {
        new Demo().m1();
        System.out.println(Demo.class);
        logger.info("{}", Demo.class);
    }

    public void m1() {
        LinkedBlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<>(8);
        linkedBlockingQueue.poll();
        try {
            logger.info("before take");
            Integer val = linkedBlockingQueue.take();
            logger.info("after take, val = " + val);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
