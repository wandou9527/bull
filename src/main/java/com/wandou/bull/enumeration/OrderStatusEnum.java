package com.wandou.bull.enumeration;

/**
 * @author liming
 * @date 2021/12/23 21:19
 */
public enum OrderStatusEnum {
    /**
     * 支付中
     */
    PAYING(0, "支付中"),
    PAYED(1, "已支付");

    private Integer code;
    private String desc;

    OrderStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
