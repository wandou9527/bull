package com.wandou.bull.test.demo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wandou.bull.model.pojo.DemoObj;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;

/**
 * @author liming
 * @date 2022/1/21 15:40
 */
public class JsonDemo {

    private String string = "{\"boostBeginDelayHours\":0,\"boostEndDelayHours\":24,\"withDrawBeginDelayHours\":24,\"withDrawEndDelayHours\":360,\"withDrawEndTime\":\"\",\"completionBoostThreshold\":15,\"completionAmountThreshold\":10000,\"thresholdEnum\":\"COUNT\",\"hitBigKnifes\":[\"5\",\"23\",\"66\",\"90\"],\"totalKnifes\":null,\"maxAmountCent\":100000000,\"minAmountCent\":6000}";

    @Test
    public void m1() {
        Gson gson = new Gson();
        Type typeOfT = new TypeToken<DemoObj>() {
        }.getType();

        DemoObj o = gson.fromJson(string, new TypeToken<DemoObj>() {
        }.getType());
        System.out.println("o = " + o);
        System.out.println("o.getBoostEndDelayHours() = " + o.getBoostEndDelayHours());

    }
}
