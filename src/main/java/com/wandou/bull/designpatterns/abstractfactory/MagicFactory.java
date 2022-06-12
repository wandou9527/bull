package com.wandou.bull.designpatterns.abstractfactory;

/**
 * @author liming
 * @date 2021/11/14 下午10:46
 */
public class MagicFactory extends AbstractFactory {
    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    public Food createFood() {
        return new Mushroom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicWand();
    }
}
