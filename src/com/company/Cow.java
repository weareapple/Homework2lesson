package com.company;

public class Cow extends Animal implements Printable{
    private String breed;

    public Cow(int age, String color, String breed) {
        super(age, color);
        this.breed = breed;
    }

    @Override
    public void print() {
        System.out.println("age =" + getAge()+
                "\ncolor = "+ getColor()+
                "\nbreed = "+ breed);

    }
}