package com.ducks.parent;

/**
 * Created by Kvendy on 04.12.2017.
 */
public class Duck {
    private String name;
    private Integer years;
    private String type;
    private String color;
    private String parentName1;
    private String parentName2;


    public void quack(){
        System.out.println("Quack Quack Quack");
    }
    public void swim(){
        System.out.println("Swimming on the water");
    }
    public void display(){
        System.out.println("Hello, I'm parent duck");
    }
}
