package com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Zad5 {
    public static void main(String[] args) {


        System.out.print("Podaj dlugosc tablicy: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        Random random = new Random();
        System.out.print("Tablica pierwotna : ");


        for(int i = 0; i < n; i++ )
        {
            array[i] = random.nextInt(20)+1;
            sum += array[i];

            System.out.print(array[i]+ ", ");
        }

        Arrays.sort(array);
        System.out.println("\nTablica posortowana: "+Arrays.toString(array));

        System.out.println("Minimum: "+ array[0]+ "\nMaksimum: "+ array[n-1]);
    }
}
