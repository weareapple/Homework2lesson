package com.company;
public class Cat extends Animal implements Printable{
    private String breed ;

    public Cat(String breed,  int age, String color) {
        super(age, color);
        this.breed = breed;
    }

    @Override
    public void print() {
        System.out.println("breed =" + breed+
                "\ncolor =" + getColor()+
                "\nage =" + getAge());

    }
}