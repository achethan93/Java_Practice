package com.java.basics;

public class Operators {
    public static void main(String[] args) {
//        Increment & Decrement
        int x = 100;
        int y = 50;
        x++; // increment
        y--; // decrement
        System.out.println("Output of num1 + 1 is "+ x);
        System.out.println("Output of num2 - 1 is "+ y);

////        Logical
        boolean booleanVal1 = true;
        boolean booleanVal2 = false;
        System.out.println("Output of AND is "+ (booleanVal1 && booleanVal2)); // && - AND
        System.out.println("Output of OR is "+ (booleanVal1 || booleanVal2)); // || - OR
        System.out.println("Output of NOT is "+ (!booleanVal1)); // ! - NOT

////		Bitwise operator performs bit by bit processing.
                        //64 32 16 8 4 2 1
        int num1 = 11; 	// 0  0  0 1 0 1 1 -> 1 1 1 0 1 0 0 - > 0 0 0 0 1   0 1
        int num2 = 21; 	// 0  0  1 0 1 0 1
//
//        // 1 if both bits are equal, else 0
//         0  0  0 0 0 0 1 == output will be 1
        System.out.println(num1 & num2);
//
//        // 1 if either bit is 1, else 0
//        // 0  0  1 1 1 1 1 == output will be 31
        System.out.println(num1 | num2);
//
//        // 1 if both are not equal, else 0
//        // 0  0  1 1 1 1 0 == output will be 30
        System.out.println(num1 ^ num2);
//
//		/*~num1 is a complement operator -> 0 to 1 and 1 to 0
//		In our example it would return -12 which is signed 8 bit equivalent to 1110100*/
        System.out.println(~num1);
//
//		/*As 2's complement of any number we can calculate by inverting all 1s to 0's and vice-versa than we add 1 to it..
//		Here N= ~N produce results -(N+1) always. Because system store data in form of 2's complement which means it stores ~N like this.
//		  ~N = -(~(~N)+1) =-(N+1). */
//
//		/*num1 << 2 is left shift operator that moves the bits to the left, discards the far left bit, and assigns the rightmost bit a value of 0.
//		In our case output is 44 which is equivalent to 0101100*/
        System.out.println(num1 << 2);
//
//		/*num1 >> 2 is right shift operator that moves the bits to the right, discards the far right bit, and assigns the leftmost bit a value of 0.
//		In our case output is 2 which is equivalent to 00000010*/
        System.out.println(num1 >> 2);

//        //Ternary Variable = (expression) ? value if expression is true : value if expression is false
        int a = 100;
        int b = 50;
        int val1=(a>b)?a:b;
        System.out.println(val1);
        int val2=(a<b)?a:b;
        System.out.println(val2);
    }
}