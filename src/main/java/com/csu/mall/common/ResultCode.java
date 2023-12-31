package com.csu.mall.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

import java.io.Serializable;

@Getter
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public enum ResultCode implements Serializable {
    SUCCESS(0, "成功"),
    ERROR(-1, "失败"),
    PARAM_ERROR(1001, "参数异常"),
    USER_EXIST_ERROR(2001, "用户已存在"),
    USER_ACCOUNT_ERROR(2002, "账号或密码错误"),
    USER_NOT_EXIST_ERROR(2003, "未找到用户"),
    ORDER_PAY_ERROR(3001, "库存不足，下单失败"),
    PARAM_LOST_ERROR(2004, "参数缺失"),
    PARAM_PASSWORD_ERROR(2005, "原密码输入错误"),
    MIAOSHA_OVER_ERROR(500500,"商品秒杀完毕，库存不足!"),
    ;

    private final int code;
    private final String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
