package com.java.oops;

    class Birds {   //The class Birds is a parent class with a method makeSound() which prints "The birds makes a sound"
        public void makeSound() {
            System.out.println("The birds makes a sound");
        }
    }
    //The class Duck and Parrot are child classes that extend the parent class Birds.
    class Duck extends Birds {
        @Override   //annotation is used to indicate that a method is intended to override a method in Birds
        public void makeSound() //makeSound() which overrides the method of the same name in Birds
        {
            System.out.println("The duck Quacks");
        }
    }
    class Parrot extends Birds {
        @Override   //annotation is used to indicate that a method is intended to override a method in Birds
        public void makeSound() { //makeSound() which overrides the method of the same name in Birds
            System.out.println("The parrot talks");
        }
    }
    public class Overriding {
        public static void main(String[] args) {
            Birds myBirds = new Birds();
            Birds myDuck = new Duck();
            Birds myParrot = new Parrot();
            myBirds.makeSound();
            myDuck.makeSound();
            myParrot.makeSound();
        }
    }