package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    String password = "sunshain";

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

    // boolean passwordright = true;
       if (password == input) {

           System.out.println("Zugang erlaubt");
       } else {
           System.out.println("Eingabe falsch");
       }
       int pry = 5;

       while (pry < 5) {
           System.out.println("Versuchen Sie noch ein Mal");
       }


        System.out.println();
    }
}