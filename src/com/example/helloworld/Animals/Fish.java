package com.example.helloworld.Animals;

public class Fish extends Animal {
    protected int _size;

    public Fish()
    {
        super();
    }
    public Fish(String name, int age, int weight,int size)
    {
        super(name, age, weight);
        _size = size;
    }
    public Fish(String name, int age,int size)
    {
        super(name, age);
        _size = size;
    }

    public int getSize()
    {
        return _size;
    }
    public void setSize(int size)
    {
        _size = size;
    }

    @Override
    public String toString()
    {
        return "Fish";
    }

    @Override
    public void eat() {
        System.out.println("I eat seaweed");
    }
    @Override
    public void getVoice() {
        System.out.println("I am fish");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep as fish");
    }
}
