package com.wandou.bull.designpatterns.factorymethod;

/**
 * @author liming
 * @date 2021/11/14 下午9:17
 */
public class Plane implements Moveable {

    @Override
    public void go() {
        System.out.println("✈️ plan flying wuwuwu ...");
    }
}
