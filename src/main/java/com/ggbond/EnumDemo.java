package com.ggbond;

import lombok.Getter;

import java.util.Arrays;

//1 定义枚举
//2 枚举结构
//3 遍历查询
public enum EnumDemo {
    AAA("111","222"),
    BBB("333","444");

    @Getter
    String code;
    @Getter
    String massage;

    EnumDemo(String code, String massage) {
        this.code = code;
        this.massage = massage;
    }
    public static EnumDemo getEnumDemo(String code){
        EnumDemo[] enumDemos = EnumDemo.values();
        for (EnumDemo demo : enumDemos) {
            if(demo.getCode().equalsIgnoreCase(code)){
                return demo;
            }
        }
        return null;
    }
    public static EnumDemo getEnumDemo02(String code){
        return Arrays.stream(EnumDemo.values()).filter(t -> t.getCode().equalsIgnoreCase(code)).findFirst().orElse(null);
    }

    public static void main(String[] args) {
        EnumDemo enumDemo02 = getEnumDemo02("111");
        System.out.println(enumDemo02.code);
        System.out.println(enumDemo02.massage);
    }
}
