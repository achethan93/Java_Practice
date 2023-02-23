package com.java.exceptions;

class Exceptionstry {
    public static void main(String args[]) {
        int n = 0;
        int A[] = {1,2,3,4,5};
        try {
            System.out.println("Element: " + A[3]);
            double quotient = 234/n;
            System.out.println("Quotient: " + quotient);
        }
        catch(ArithmeticException e) {
//            throw new RuntimeException(e);
            System.out.println("Division by zero has occurred");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bound index has occurred");
        }
        catch(Exception e) {
            System.out.println("Some other exception has occurred");
        }
        finally {
            System.out.println("Exited from the try-catch block");
        }
    }
}