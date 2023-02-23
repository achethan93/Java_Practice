package com.java.oops;
public class encapsulation {
        // These private variables can only be accessed by public methods of class
        private int age;    // Variables declared as private
        private String name;    // Variables declared as private
        public int getAge(){    // getter method to access private variable
            return age;
        }
        public String getName(){    // getter method to access private variable
            return name;
        }
        public void setAge(int inputAge){   // setter method to access private variable
            age = inputAge;
        }
        public void setName(String inputName){  // setter method to access private variable
            name = inputName;
        }
    public static void main(String [] args){
        encapsulation obj = new encapsulation();
        // Setting values of the variables
        obj.setAge(25);
        obj.setName("Rajkumar");
        System.out.println("My name is "+ obj.getName());
        System.out.println("My age is "+ obj.getAge());
    }
}
