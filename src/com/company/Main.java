package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog(4, "Black", " Фас");
        dog.print();
        Cat cat = new Cat("Шотландская", 2, "Grey");
        cat.print();
        Cow cow = new Cow(5, "White", "Каракатинская");
        cow.print();
        Printable[] printables = {cat, dog, cow};

        createObject("cat").print();
        createObject("dog").print();
        createObject("cow").print();
    }

    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "cat":
                printable = new Cat("Шотландская", 2, "Grey");
                break;
            case "dog":
                printable = new Dog(4, "Black", " Фас");
                break;
            case "cow":
                printable = new Cow(5, "White", "Каракатинская");
                break;
        }
        return printable;
    }

}

