package com.wandou.bull.designpatterns.abstractfactory;

/**
 * @author liming
 * @date 2021/11/14 下午10:30
 */
public abstract class AbstractFactory {

    /**
     * 生产交通工具
     *
     * @return
     */
    public abstract Vehicle createVehicle();

    /**
     * 生产食物
     *
     * @return
     */
    public abstract Food createFood();

    /**
     * 生产武器
     *
     * @return
     */
    public abstract Weapon createWeapon();

}
