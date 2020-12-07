package com.wandou.bull.demo;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author liming
 * @date 2020/11/25
 * @description
 */
public class Demo {

    public void m1() {
        LinkedBlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<>();
        linkedBlockingQueue.poll();
    }
}
