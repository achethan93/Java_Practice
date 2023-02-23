package com.java.threads;

//The RCountdownTimer class is the main class for the program.
public class CountdownTimer {
    //The main method is the entry point for the program.
    public static void main(String[] args) {
        //A new CountDownThread object is created with an initial countdown time of 10 seconds.
        CountDownThread countDownThread = new CountDownThread(10);
        countDownThread.start();    //The start method is called on the CountDownThread object to start the thread.
    }

    //The CountDownThread class is defined as a static nested class that extends the Thread class.
    static class CountDownThread extends Thread {
        private int time;   //An instance variable time is declared to hold the remaining time for the countdown.

        //The constructor for CountDownThread takes an int argument time and initializes the time instance variable with it.
        public CountDownThread(int time) {
            this.time = time;
        }
//The run method is overridden to define the behavior of the thread when it starts running.
        @Override
        public void run() {
            try {
                //The while loop in the run method runs as long as the time variable is greater than 0.
                while (time > 0) {
                    //In each iteration of the loop, the remaining time is printed to the console
                    System.out.println("Time left: " + time);
                    Thread.sleep(1000); //the thread sleeps for 1 second
                    time--; //The time variable is decremented by 1 after each iteration
                }
                //Once the time variable reaches 0, the loop terminates and the message "Time's up!"
                System.out.println("Time's up!");
            }
//If the thread is interrupted while sleeping, the InterruptedException is caught and its stack trace is printed to the console
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}