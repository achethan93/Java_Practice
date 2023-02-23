package com.java.oops;
//single inheritance
public class Inheritance {
        float salary = 40000;
    }
    class Programmer extends Inheritance {
        int bonus = 10000;
        public static void main(String args[]) {
            Programmer p = new Programmer();
            System.out.println("Inheritance_Java salary is:" + p.salary);
            System.out.println("Bonus of Programmer is:" + p.bonus);
        }
    }