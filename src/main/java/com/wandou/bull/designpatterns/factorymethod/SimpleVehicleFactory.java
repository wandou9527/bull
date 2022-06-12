package com.wandou.bull.designpatterns.factorymethod;

/**
 * @author liming
 * @date 2021/11/14 下午9:52
 * 简单工厂，扩展性不好。当新加交通工具时，工厂需要改动
 */
public class SimpleVehicleFactory {

//    public Car createCar() {
//        return new Car();
//    }
//
//    public Plane createPlan() {
//        return new Plane();
//    }

    public static Moveable createVehicle(String type) {
        if ("car".equals(type)) {
            return new Car();
        } else if ("plane".equals(type)) {
            return new Plane();
        }
        return null;
    }
}
