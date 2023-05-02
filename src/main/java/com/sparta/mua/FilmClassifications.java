package com.sparta.mua;

import java.util.Scanner;

public class FilmClassifications {

    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        // checks if the input is a number
        if(scanner.hasNextInt()) {
            age = scanner.nextInt();
            System.out.println(availableClassifications(age));
        }
        else {
            System.out.println("Not a valid number!");
        }
    }

    public static String availableClassifications(int ageOfViewer)
    {
        String result;
        if (ageOfViewer < 0 || ageOfViewer > 127) //oldest person 122+5
        {
            result = "Invalid Age!";
        }
        else if (ageOfViewer >= 18)
        {
            result = "All films are available.";
        }
        else if (ageOfViewer >= 15)
        {
            result = "U, PG, 12 & 15 rated films are available.";
        }
        else if (ageOfViewer >= 12)
        {
            result = "U, PG & 12 rated films are available.";
        }
        else if (ageOfViewer >= 8)
        {
            result = "U & PG rated films are available.";
        }
        else if (ageOfViewer >= 4)
        {
            result = "U rated films are available.";
        }
        else
        {
            result = "See guidance for specific film.";
        }
        return result;


/* Changed order as you'd rather have see guidance
rather than all films available in the event of an error */
//        String result;
//        if (ageOfViewer < 0 || ageOfViewer > 127) //oldest person 122+5
//        {
//            result = "Invalid Age!";
//        }
//        else if (ageOfViewer < 4)
//        {
//            result = "See guidance for specific film.";
//        }
//        else if (ageOfViewer < 8)
//        {
//            result = "U rated films are available.";
//        }
//        else if (ageOfViewer < 12)
//        {
//            result = "U & PG rated films are available.";
//        }
//        else if (ageOfViewer < 15)
//        {
//            result = "U, PG & 12 rated films are available.";
//        }
//        else if (ageOfViewer < 18)
//        {
//            result = "U, PG, 12 & 15 rated films are available.";
//        }
//        else
//        {
//            result = "All films are available.";
//        }
//        return result;
    }
}
