package com.wandou.bull.designpatterns.abstractfactory;

/**
 * @author liming
 * @date 2021/11/14 下午10:36
 */
public class Mushroom extends Food {
    @Override
    public void printName() {
        System.out.println("我是毒蘑菇🍄");
    }
}
