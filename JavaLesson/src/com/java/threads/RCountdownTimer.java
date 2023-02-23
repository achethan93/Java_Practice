package com.java.threads;

public class RCountdownTimer {
    // The main method of the program
    public static void main(String[] args) {
        // Create a new CountDownThread with a time limit of 10 seconds
        CountDownThread countDownThread = new CountDownThread(10);
        // Create a new Thread with the CountDownThread as a Runnable
        Thread thread = new Thread(countDownThread);
        // Start the thread
        thread.start();
    }

    // A class that implements the Runnable interface
    static class CountDownThread implements Runnable {
        // The time limit for the countdown
        private int time;

        // The constructor for the CountDownThread class
        public CountDownThread(int time) {
            this.time = time;
        }

        // The method that is executed when the thread is started
        @Override
        public void run() {
            // Loop until the time limit is reached
            while (time > 0) {
                System.out.println("Time Left: " +time);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                    time--;  // Decrease the time by 1
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Time is up");
        }
    }
}