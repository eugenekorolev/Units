package com.ducks2.children;

import com.ducks2.parent.Duck;
import com.ducks2.parent.Quackable;

/**
 * Created by Kvendy on 05.12.2017.
 */
public class ToyDuck extends Duck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
