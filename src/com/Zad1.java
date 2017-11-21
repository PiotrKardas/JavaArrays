package com;

import java.util.Random;
import java.util.Scanner;


public class Zad1 {

    public static void main(String[] args) {

        System.out.print("Podaj dlugosc tablicy: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] tab = new int[n];
        int sum = 0;
        Random random = new Random();
        System.out.print("tab : ");

        for(int i = 0; i < n; i++ )
        {
            tab[i] = random.nextInt(20)+1;
            sum += tab[i];

            System.out.print(tab[i]+ " ");
        }

        System.out.println("\nSuma : " + sum);


    }
}
