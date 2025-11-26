package com.example.helloworld.Animals;

public class Bird extends Animal {
    protected String _featherColor;

    public Bird()
    {
        super();
    }
    public Bird(String name, int age, int weight,String featherColor)
    {
        super(name, age, weight);
        _featherColor = featherColor;
    }
    public Bird(String name, int age,String featherColor)
    {
        super(name, age);
        _featherColor = featherColor;
    }

    public String getFeatherColor() {
        return this._featherColor;
    }
    public void setFeatherColor(String featherColor)
    {
        this._featherColor = featherColor;
    }

    @Override
    public String toString()
    {
        return "Bird";
    }

    public void getVoice() {
        System.out.println("I am Bird");
    }

    @Override
    public void eat() {
        System.out.println("I eat seeds");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep as bird");
    }
}
