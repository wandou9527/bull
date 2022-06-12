package com.wandou.bull.designpatterns.factorymethod;

/**
 * @author liming
 * @date 2021/11/14 下午9:59
 */
public class CarFactory {

    public Car createCar() {
        //加入日志
        System.out.println("a car created.");
        return new Car();
    }
}
