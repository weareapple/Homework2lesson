package com.company;

public class Dog extends Animal implements Printable{
    private String commands;

    public Dog(int age , String
            color, String commands) {
        super (age, color);
        this.commands = commands;
    }

    @Override
    public void print() {
        System.out.println("age = " + getAge() +
                "\ncolor =" + getColor() +
                "\ncommands = " + commands);

    }
}
