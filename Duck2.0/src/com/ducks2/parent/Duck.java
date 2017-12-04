package com.ducks2.parent;

/**
 * Created by Kvendy on 05.12.2017.
 */
public class Duck {
    private String name;
    private Integer years;
    private String type;
    private String color;
    private String parentName1;
    private String parentName2;

    public void display(){
        System.out.println("Hello, I'm parent duck");
    }

    private Flyable flyable;
    private Quackable quackable;

    public void fly(){
        flyable.fly();
    }
    public void quack(){
        quackable.quack();
    }


    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }
}
