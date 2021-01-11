package com.codecool.interfacews;

public interface Speaking {

    default void speak(String str) {
        System.out.println(str);
    }

}
