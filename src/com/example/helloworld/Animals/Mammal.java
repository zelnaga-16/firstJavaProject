package com.example.helloworld.Animals;

public class Mammal extends Animal {
    protected String _color;

    public Mammal()
    {
        super();
    }
    public Mammal(String name, int age, int weight,String color)
    {
        super(name, age, weight);
        _color = color;
    }
    public Mammal(String name, int age,String color)
    {
        super(name, age);
        _color = color;
    }

    public String getColor() {
        return _color;
    }
    public void setColor(String color)
    {
        _color=color;
    }

    @Override
    public String toString()
    {
        return "Mammal";
    }

    @Override
    public void getVoice() {
        System.out.println("gav gav");
    }

    @Override
    public void eat() {
        System.out.println("I eat meat");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep as mammal");
    }
}
