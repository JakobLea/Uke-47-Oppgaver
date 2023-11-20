package com.example.uke47oppgaver;

public class FizzBuzz {
    public static void main(String[] args) {
        // FizzBuzz fra 1 til 100
        System.out.println("FizzBuzz (1-100):");
        for (int i = 1; i <= 100; i++) {
            printFizzBuzz(i);
        }

        // FizzBuzz fra 100 til 1 med nye regler
        System.out.println("\nFizzBuzz (100-1) with new rules:");
        for (int i = 100; i >= 1; i--) {
            printExtendedFizzBuzz(i);
        }
    }

    private static void printFizzBuzz(int num) {
        // Sjekk om tallet er delelig med både 3 og 5
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        // Sjekk om tallet er delelig med 3
        else if (num % 3 == 0) {
            System.out.println("Fizz");
        }
        // Sjekk om tallet er delelig med 5
        else if (num % 5 == 0) {
            System.out.println("Buzz");
        }
        // Hvis ingen av de overnevnte betingelsene er oppfylt, skriv ut tallet
        else {
            System.out.println(num);
        }
    }

    private static void printExtendedFizzBuzz(int num) {
        // Sjekk om tallet er delelig med 9
        if (num % 9 == 0) {
            System.out.println("Jazz");
        }
        // Sjekk om tallet er delelig med 4
        else if (num % 4 == 0) {
            System.out.println("Fuzz");
        }
        // Hvis ingen av de overnevnte betingelsene er oppfylt, skriv ut tallet
        else {
            System.out.println(num);
        }
    }
}
