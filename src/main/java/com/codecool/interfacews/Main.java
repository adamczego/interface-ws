package com.codecool.interfacews;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bird bird1 = new Bird("bird1", true);
        Bird bird2 = new Bird("bird2", true);
        Ladybird ladybird1 = new Ladybird("ladybird1", false);
        Ladybird ladybird2 = new Ladybird("ladybird2", false);

        bird1.fly();
        bird2.fly();
        ladybird1.fly();
        ladybird2.fly();

        bird1.feed();
        bird2.feed();
        ladybird1.feed();
        ladybird2.feed();




        List<Animal> flyers = new ArrayList<Animal>(List.of(
            new Bird("bird1", true),
            new Bird("bird2", true),
            new Ladybird("ladybird1", false),
            new Ladybird("ladybird2", false)
        ));

        flyers.forEach(Flying::fly);
        flyers.forEach(Feeding::feed);


    }


    public void fly() {
        Bird bird1 = new Bird("bird1", true);
        Bird bird2 = new Bird("bird2", true);
        Ladybird ladybird1 = new Ladybird("ladybird1", false);
        Ladybird ladybird2 = new Ladybird("ladybird2", false);

        bird1.fly();
        bird2.fly();
        ladybird1.fly();
        ladybird2.fly();
    }

    public void feed() {
        Bird bird1 = new Bird("bird1", true);
        Bird bird2 = new Bird("bird2", true);
        Ladybird ladybird1 = new Ladybird("ladybird1", false);
        Ladybird ladybird2 = new Ladybird("ladybird2", false);

        bird1.feed();
        bird2.feed();
        ladybird1.feed();
        ladybird2.feed();
    }

}
