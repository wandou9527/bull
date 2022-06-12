package com.wandou.bull.test.demo;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemoTest {

    @Test
    public void t1() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(new Integer(1000), 1);
        map.put(new Integer(1000), 2);
        map.put(new Integer(1000), 3);

        System.out.println(map.size());
    }

    @Test
    public void t2ContainsKey() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "a1");
        map.put("b", null);

        System.out.println("map.containsKey(\"a\") = " + map.containsKey("a"));
        System.out.println("map.containsKey(\"b\") = " + map.containsKey("b"));
        System.out.println("map.get(\"b\") = " + map.get("b"));
    }
}
