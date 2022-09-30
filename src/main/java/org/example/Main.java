package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String password = "sunshine";


        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();


            if (password.equals(input)) {

                System.out.println("Zugang erlaubt");
                break;
            } else {
                System.out.println("Eingabe falsch");
            }
            System.out.println("Versuchen Sie noch ein Mal");
        }
        if ( int i = 0 ){
            System.out.println("Zugang gesperrt");
        } else {
            System.out.println("Zugang erlaubt, viel Spass");
        }
    }
}