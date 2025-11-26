package com.example.helloworld.Animals;

public class Blowfish extends Fish {
    protected boolean _isInDefenceMode;

    public Blowfish()
    {
        super();
    }
    public Blowfish(String name, int age, int weight,int size,boolean isInDefenceMode)
    {
        super(name, age, weight,size);
        this._isInDefenceMode = isInDefenceMode;
    }
    public Blowfish(String name, int age,int size,boolean isInDefenceMode)
    {
        super(name, age,size);
        _isInDefenceMode = isInDefenceMode;
    }

    public boolean getIsInDefenceMode()
    {
        return _isInDefenceMode;
    }
    public void setIsInDefenceMode(boolean value)
    {
        _isInDefenceMode = value;
    }

    @Override
    public String toString()
    {
        return "Blowfish";
    }
    @Override
    public void move()
    {
        System.out.println("Blowfish swim");
    }

    @Override
    public void eat() {
        System.out.println("I eat seaweed");
    }
    @Override
    public void getVoice() {
        System.out.println("bul bul bul");
    }
}
