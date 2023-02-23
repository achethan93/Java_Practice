package com.java.basics;

public class DataTypes {

    public static void main(String[] args) {

        byte byteDataType = 127;
        //Change the value of byte data type to 128 and you will find an error. The range of byte is from -128 to 128
//        byte byteDataTypeNew = 128;
        short shortDataType = 100;
        //Change the value of short data type to 32768 and you will find an error. The range of short is from -32768 to 32767
//        short shortDataTypeNew = 32768;
        int intDataType = 32768;            //occupies four bytes of memory
        long longDataType = 2147483648L;    //use eight bytes
        float floatDataType = 20.99F;       //occupies four bytes of memory
        double doubleDataType = 49999999.9d; //use eight bytes
        char charDataType = 'M';            //occupies two bytes in memory
        boolean booleanDataType = true;     //one bit

        System.out.println(byteDataType);
        System.out.println(shortDataType);
        System.out.println(intDataType);
        System.out.println(longDataType);
        System.out.println(floatDataType);
        System.out.println(doubleDataType);
        System.out.println(charDataType);
        System.out.println(booleanDataType);

//        //Type casting
        double newDouble = intDataType; // Automatic casting: int to double - Widening Casting
        System.out.println(newDouble);
//
        int newInteger = (int) doubleDataType; // Manual casting: double to int - Narrowing Casting
        System.out.println(newInteger);

//        //Overflow
        byte b = (byte) intDataType;
        System.out.println(b);

    }

}