package com.wandou.bull.designpatterns.abstractfactory;

/**
 * @author liming
 * @date 2021/11/14 下午10:45
 */
public class ModernFactory extends AbstractFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Food createFood() {
        return new Bread();
    }

    @Override
    public Weapon createWeapon() {
        return new AK47();
    }
}
