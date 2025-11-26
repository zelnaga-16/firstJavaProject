package com.example.helloworld.Animals;

public class Dog extends Mammal {
    protected String _clawType;

    public Dog()
    {
        super();
    }
    public Dog(String name, int age, int weight,String color,String clawType)
    {
        super(name, age, weight,color);
        _clawType = clawType;
    }
    public Dog(String name, int age,String color,String clawType)
    {
        super(name, age,color);
        _clawType = clawType;
    }

    public String getClawType()
    {
        return _clawType;
    }
    public void setClawType(String clawType)
    {
        _clawType = clawType;
    }

    @Override
    public String toString()
    {
        return "Dog";
    }
    @Override
    public void move()
    {
        System.out.println("Dog run");
    }

    @Override
    public void getVoice() {
        System.out.println("gav gav");
    }

    @Override
    public void eat() {
        System.out.println("I eat meat");
    }
}
