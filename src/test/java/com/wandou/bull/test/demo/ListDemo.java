package com.wandou.bull.test.demo;

import com.wandou.bull.demo.Demo;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liming
 * @date 2021/12/23 15:04
 */
public class ListDemo {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void f() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            list.add(i);
        }
        list.forEach(i -> logger.info("forEach {}", i));

        list.stream().parallel().forEach(i -> logger.info("parallel().forEach {}", i));
    }
}
