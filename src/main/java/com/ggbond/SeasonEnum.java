package com.ggbond;

import com.sun.javaws.Main;
import lombok.Getter;

import java.util.Arrays;

/*
* 1 枚举定义
* 2 枚举构造
* 3 遍历查询
//模拟修改一下
* */
public enum SeasonEnum {
    //1.枚举定义
    SPRING("猪猪侠","1","2"),
    SUMMER("超人强","11","22"),
    AUTUMN("小呆呆","00","33"),
    WINTER("小菲菲","66","33");
    @Getter
    String code;
    @Getter
    String message1;
    @Getter
    String message2;
    //2.枚举构造
    SeasonEnum(String code, String message1, String message2) {
        this.code = code;
        this.message1 = message1;
        this.message2 = message2;
    }
    //3.遍历查询
    public static SeasonEnum getSeasonEnum(String code)
    {
        SeasonEnum[] bankEnums = SeasonEnum.values();

        for (SeasonEnum element : bankEnums) {
            System.out.println(element);
            if(element.getCode().equalsIgnoreCase(code))
            {
                return element;
            }
        }
        return null;
    }

    public static SeasonEnum getSeasonEnum02(String code){
        return Arrays.stream(SeasonEnum.values()).filter(t -> t.getCode().equalsIgnoreCase(code)).findFirst().orElse(null);
    }

    public static void main(String[] args) {
        SeasonEnum enum1 = getSeasonEnum("猪猪侠");
        System.out.println(enum1.getCode());
        System.out.println(enum1.getMessage1());
        System.out.println(enum1.getMessage2());
    }
}
