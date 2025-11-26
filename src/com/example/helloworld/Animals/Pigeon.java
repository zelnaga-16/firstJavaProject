package com.example.helloworld.Animals;

public class Pigeon extends Bird{
    protected String _specieName;

    public Pigeon()
    {
        super();
    }
    public Pigeon(String name, int age, int weight,String featherColor,String specieName)
    {
        super(name, age, weight,featherColor);
        _specieName = specieName;
    }
    public Pigeon(String name, int age,String featherColor,String specieName)
    {
        super(name, age,featherColor);
        _specieName = specieName;
    }

    public String getSpecieName()
    {
        return this._specieName;
    }
    public void SetSpecieName(String specieName)
    {
        this._specieName=specieName;
    }

    @Override
    public String toString()
    {
        return "Pigeon";
    }

    @Override
    public void move()
    {
        System.out.println("Pigeon fly");
    }

    @Override
    public void getVoice() {
        System.out.println("I am Pigeon");
    }

    @Override
    public void eat() {
        System.out.println("I eat seeds");
    }
}
