package com.ggbond;

import lombok.Getter;

import java.util.Arrays;

public enum SeasonEnum02 {
    AAA("111","222","333"),
    BBB("333","222","111");
    @Getter
    String code;
    @Getter
    String message1;
    @Getter
    String message2;

    SeasonEnum02(String code, String message1, String message2) {
        this.code = code;
        this.message1 = message1;
        this.message2 = message2;
    }
    public static SeasonEnum02 getSeasonEnum(String code){
        SeasonEnum02[] values = SeasonEnum02.values();
        System.out.println(values);
        for (SeasonEnum02 value : values) {
            if (value.getCode().equalsIgnoreCase(code)){
                return value;
            }
        }
        return null;
    }
    public static SeasonEnum02 getSeasonEnum02(String code){
        return Arrays.stream(SeasonEnum02.values()).filter(t -> t.getCode().equalsIgnoreCase(code)).findFirst().orElse(null);
    }

    public static void main(String[] args) {
        SeasonEnum02 seasonEnum02 = getSeasonEnum02("111");
        System.out.println(seasonEnum02.getCode());
        System.out.println(seasonEnum02.getMessage1());
        System.out.println(seasonEnum02.getMessage2());
    }
}
