package com.wandou.bull.designpatterns.factorymethod;

/**
 * @author liming
 * @date 2021/11/14 下午9:21
 */
public class Broom implements Moveable {

    @Override
    public void go() {
        System.out.println("🧹 broom flying sousousou ...");
    }
}
