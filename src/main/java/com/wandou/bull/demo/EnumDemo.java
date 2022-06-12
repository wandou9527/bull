package com.wandou.bull.demo;

import com.wandou.bull.enumeration.OrderStatusEnum;

/**
 * @author liming
 * @date 2021/12/23 21:17
 */
public class EnumDemo {

    public static void main(String[] args) {
        OrderStatusEnum anEnum = OrderStatusEnum.valueOf("PAYING");
        System.out.println("anEnum = " + anEnum);

        OrderStatusEnum anEnum1 = OrderStatusEnum.valueOf("PAYING1");
        System.out.println("anEnum1 = " + anEnum1);
    }
}
