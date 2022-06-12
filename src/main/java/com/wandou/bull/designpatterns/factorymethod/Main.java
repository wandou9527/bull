package com.wandou.bull.designpatterns.factorymethod;

/**
 * @author liming
 * @date 2021/11/14 下午8:59
 */
public class Main {

    public static void main(String[] args) {
        Moveable moveable = SimpleVehicleFactory.createVehicle("plane");
        assert moveable != null;
        moveable.go();
    }
}
