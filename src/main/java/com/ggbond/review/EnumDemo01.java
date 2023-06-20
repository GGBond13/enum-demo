package com.ggbond.review;

import com.ggbond.EnumDemo;
import lombok.Getter;

import java.util.Arrays;

/*
* 阳哥口诀:
* 定义枚举 枚举结构 查询遍历
* */
public enum EnumDemo01 {
    AAA("AAA","111"),
    BBB("BBB","222");

    @Getter
    String code;
    @Getter
    String message;

    EnumDemo01(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static EnumDemo01 getEnumDemo01(String code){
        EnumDemo01[] values = EnumDemo01.values();
        for (EnumDemo01 value : values) {
            if (value.getCode().equalsIgnoreCase(code)){
                return value;
            }
        }
        return null;
    }
    public static EnumDemo01 getEnumDemo02(String code){
        return Arrays.stream(EnumDemo01.values()).filter(t -> t.getCode().equalsIgnoreCase(code)).findFirst().orElse(null);
    }
    public static void main(String[] args) {
        EnumDemo01 demo01 = getEnumDemo01("AAA");
        System.out.println(demo01);
    }
}
