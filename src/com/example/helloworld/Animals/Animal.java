package com.example.helloworld.Animals;

public abstract class Animal implements AnimalBehavior, AnimalMove, AnimalName {
    protected String _name;
    protected int  _age;
    protected int _weight;

    public Animal(){}
    public Animal(String name, int age, int weight)
    {
        this._name = name;
        this._age = age;
        this._weight = weight;
    }
    public Animal(String name, int age)
    {
        this._name = name;
        this._age = age;
    }

    public String getName()
    {return this._name;}
    public void setName(String name)
    {this._name = name;}
    public int getAge()
    {return this._age;}
    public void setAge(int age)
    {this._age = age;}
    public int getWeight()
    {return this._weight;}
    public void setWeight(int weight)
    {this._weight = weight;}

    @Override
    public String toString()
    {
        return "Animal";
    }



    public abstract void getVoice();
    public abstract void eat();

}
