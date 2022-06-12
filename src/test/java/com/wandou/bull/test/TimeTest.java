package com.wandou.bull.test;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * @author liming
 * @date 2021/11/29 下午5:05
 */
public class TimeTest {

    @Test
    public void m1() {
        System.out.println("TimeUnit.HOURS.toSeconds(1) = " + TimeUnit.HOURS.toSeconds(1));
        System.out.println("TimeUnit.SECONDS.toSeconds(60) = " + TimeUnit.SECONDS.toSeconds(60));

        System.out.println("Duration.ofHours(1).getSeconds() = " + Duration.ofHours(1).getSeconds());
        System.out.println("Duration.ofHours(1).toMinutes() = " + Duration.ofHours(1).toMinutes());
        System.out.println("Duration.ofMillis(1).getSeconds() = " + Duration.ofMillis(1).getSeconds());
        System.out.println("Duration.ofMillis(1).getNano() = " + Duration.ofDays(1).getNano());
    }
}
