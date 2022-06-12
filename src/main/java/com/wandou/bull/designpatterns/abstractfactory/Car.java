package com.wandou.bull.designpatterns.abstractfactory;


/**
 * @author liming
 * @date 2021/11/14 下午8:59
 */
public class Car extends Vehicle {

    @Override
    public void go() {
        System.out.println("🚗 car go sousousou ...");
    }
}
