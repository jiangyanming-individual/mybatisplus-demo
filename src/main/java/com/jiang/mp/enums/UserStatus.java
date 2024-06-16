package com.jiang.mp.enums;

/**
 * 枚举类型
 */
public enum StatusEnum {

    NORMAL(1,"正常"),
    FORBID(2,"正常");

    private int status;
    private String desc;

    StatusEnum(int status,String desc) {
        this.desc = desc;
        this.status = status;
    }
}
