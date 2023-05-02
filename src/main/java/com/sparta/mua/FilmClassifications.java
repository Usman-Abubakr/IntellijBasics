package com.sparta.mua;

public class FilmClassifications {

    public static void main(String[] args) {
        int age = 24;
        System.out.println(availableClassifications(age));
    }

    public static String availableClassifications(int ageOfViewer)
    {
        String result;
        if (ageOfViewer < 0 || ageOfViewer > 127) //oldest person 122+5
        {
            result = "Invalid Age!";
        }
        else if (ageOfViewer < 12)
        {
            result = "U, PG & 12 films are available.";
        }
        else if (ageOfViewer < 15)
        {
            result = "U, PG, 12 & 15 films are available.";
        }
        else
        {
            result = "All films are available.";
        }
        return result;
    }
}
