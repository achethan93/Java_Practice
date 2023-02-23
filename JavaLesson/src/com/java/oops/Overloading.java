package com.java.oops;
// method overloading
    class Animal {
        public void makeSound() {
            System.out.println("The animal makes a sound");
        }
        public void makeSound(int numberOfSounds) {
            for (int i = 0; i < numberOfSounds; i++) {
                makeSound();
            }
        }
    }
    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The dog barks");
        }
    }
    class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The cat meows");
        }
    }
    public class Overloading {
        public static void main(String[] args) {
            Animal myAnimal = new Animal();
            Animal myDog = new Dog();
            Animal myCat = new Cat();
            myAnimal.makeSound(); // makesound overloads by taking int  and with no arg (different parameters)
            myAnimal.makeSound(1);  // makesound overloads by taking different parameters
            myDog.makeSound(1);
            myCat.makeSound(1);
        }
    }