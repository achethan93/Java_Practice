package com.java.oops;
public class Bank { //Class name Bank
    // private attributes inaccessible to the class
    private String name;
    private int account_no;
    private float balance;
    // private Methods accessible only by objects or other methods in the same class
    public void getData() { //user defined method member for getting data
        name = "HDFC";
        account_no = 0000000012345;
        balance = 0;
    }
    private void deposit(float amt) {   //Method to increase amount in the bank account
        balance += amt; //balance = balance + amt
    }
    private float calculateAmount(float principal, float rate, int time) {  //Method members
        float simpleInterest = (principal * rate * time) / 100;
        float amount = principal + simpleInterest;
        return amount; //Returns 'amount' in float
    }
    protected void displayData() { //Protected Method member
        System.out.println("Name: " + name);
        System.out.println("Account number: " + account_no);
        System.out.println("Balance: " + balance);
    }
    public static void main (String[] args) {   //main method where the execution will begin
        Bank obj = new Bank();  //object obj created of the class (Instantiating a class), to call method members in the class
        obj.getData();
        obj.deposit(1500);
        float amount = obj.calculateAmount(300, 4, 2);
        System.out.println("Amount calculated for Rs 300/- at a rate of 4% for 2 years is: " + amount);
        obj.displayData();
    }
}