package com;

import java.util.Random;
import java.util.Scanner;


public class Zad2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Podaj dlugosc tablicy pierwotnej : ");
        int n = scanner.nextInt();

        int[] originalTab = new int[n];
        int[] newTab = new int[n*2];
        int i;

        System.out.print("Tablica pierwotna: [ ");

        for(i = 0; i< n ; i++){

            originalTab[i] = random.nextInt(10)+1;
            System.out.print(originalTab[i]+" ");
        }

        System.out.print(" ] ");
        System.out.print("Nowa tablica: [ ");
        for (int j = 0; j < newTab.length-1; j++)
        {
            newTab[j] = 0;
            System.out.print(newTab[j]+ " " );
        }
        newTab[newTab.length-1] = i;
        System.out.print(newTab[newTab.length-1]+" ] " );




    }
}
