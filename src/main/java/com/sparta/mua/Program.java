package com.sparta.mua;

public class Program {

    public static void main(String[] args) {
        int timeOfDay = 21;
        System.out.println(getGreeting(timeOfDay));
    }

    public static String getGreeting(int timeOfDay) {
        String greeting = "";
        if (timeOfDay >= 5 && timeOfDay < 12) {
            greeting = "Good Morning!";
        } else if (timeOfDay >= 12 && timeOfDay < 18) {
            greeting = "Good Afternoon!";
        } else if (timeOfDay < 0 || timeOfDay > 23) {
            greeting = "Invalid time!";
        } else {
            greeting = "Good Evening!";
        }
        return greeting;
    }
}