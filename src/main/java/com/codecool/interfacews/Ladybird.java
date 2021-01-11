package com.codecool.interfacews;

public class Ladybird implements Animal {

    String name;
    boolean isFemale;

    public Ladybird(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    @Override
    public void fly() {
        System.out.println("Buzz, Buzz");
    }

    public void feed() {
        speak("I love aphid");
    }
}
