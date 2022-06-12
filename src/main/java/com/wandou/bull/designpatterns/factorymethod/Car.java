package com.wandou.bull.designpatterns.factorymethod;

/**
 * @author liming
 * @date 2021/11/14 下午8:59
 */
public class Car implements Moveable {

    @Override
    public void go() {
        System.out.println("🚗 car go sousousou ...");
    }
}
