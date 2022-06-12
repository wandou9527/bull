package com.wandou.bull.designpatterns.abstractfactory;

/**
 * @author liming
 * @date 2021/11/14 下午10:14
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new MagicFactory();

        Vehicle vehicle = factory.createVehicle();
        vehicle.go();
        Weapon weapon = factory.createWeapon();
        weapon.shoot();
        Food food = factory.createFood();
        food.printName();
    }
}
