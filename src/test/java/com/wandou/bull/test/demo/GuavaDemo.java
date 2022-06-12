package com.wandou.bull.test.demo;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheStats;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author liming
 * @date 2021/11/29 下午8:45
 */
public class GuavaDemo {

    private static Cache<String, List<String>> sightCache = CacheBuilder.newBuilder()
            .maximumSize(10240)
            .expireAfterWrite(60, TimeUnit.MINUTES)
            .build();

    static {
        sightCache.put("a", new ArrayList<>());
        sightCache.put("b", Arrays.asList("ele1", "ele2", "ele3"));
    }


    @Test
    public void m1() {
        System.out.println(sightCache);
        for (int i = 0; i < 100; i++) {
            List<String> a = sightCache.getIfPresent("a");
            System.out.println("a = " + a);
            List<String> b = sightCache.getIfPresent("b");
            System.out.println("b = " + b);
            List<String> c = sightCache.getIfPresent("c");
            System.out.println("c = " + c);
            sightCache.getIfPresent("a" + i);
        }


        CacheStats stats = sightCache.stats();
        System.out.println("stats = " + stats);

    }
}
