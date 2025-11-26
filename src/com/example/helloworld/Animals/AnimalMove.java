package com.example.helloworld.Animals;

public interface AnimalMove {
    default public void move()
    {
        System.out.println("Animal move");
    }
}
