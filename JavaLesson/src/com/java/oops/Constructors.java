package com.java.oops;

public class Constructors {
    //Default Constructors
    Constructors() {
        System.out.println("This is a default constructors");
    }
    //Parameterized Constructor
    String name;    int quantity;   int price;
    Constructors(String n1, int q1, int p1){   //Parameterized Constructor with 3 parameters
        name = n1;
        quantity = q1;
        price = p1;
    }
    Constructors(String n2, int p2){   //Parameterized Constructor overloading with 2 parameters
        name = n2;
        price = p2;
        quantity = price/10;
    }
    Constructors(Constructors C) {  //Copy Constructor
        name = C.name;
        quantity = C.quantity;
        price = C.price;
    }
    void display(){
        System.out.println("Product Name "+ name);
        System.out.println("Product quantity is "+ quantity);
        System.out.println("Product price is "+ price);
    }
    public static void main(String[] args){
        Constructors product1;
        product1 = new Constructors("Dates",500,50);
        System.out.println("parameterised Constructor with 3 parameter or arguments");
        product1.display();
        product1 = new Constructors("Cashew",800);
        System.out.println('\n' + "parameterised Constructor Overloading");
        product1.display();
        product1 = new Constructors(product1);
        System.out.println('\n' + "Copy Constructor");
        product1.display();
    }
}