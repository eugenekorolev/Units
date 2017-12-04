package com.ducks;

import com.ducks.children.CitizenDuck;
import com.ducks.children.NewsDuck;
import com.ducks.children.ToyDuck;
import com.ducks.parent.Duck;

public class Main {

    public static void main(String[] args) {

        Duck duck = new Duck();
        Duck citizenDuck = new CitizenDuck();
        Duck newsDuck = new NewsDuck();
        Duck toyDuck = new ToyDuck();

        Main main = new Main();
        main.doSomething(duck);
        main.doSomething(citizenDuck);
        main.doSomething(newsDuck);
//        main.doSomething(toyDuck);

    }

    public void doSomething(Duck duck){
        System.out.println("***********************");
        duck.display();
        duck.swim();
        duck.quack();
        System.out.println("***********************");
        System.out.println();
    }
}
