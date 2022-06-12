package com.wandou.bull.designpatterns.abstractfactory;

/**
 * @author liming
 * @date 2021/11/14 下午10:37
 */
public class MagicWand extends Weapon {
    @Override
    public void shoot() {
        System.out.println("魔法棒电dian dian ...");
    }
}
