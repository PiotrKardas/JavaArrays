package com;

import java.util.Arrays;
import java.util.Scanner;


public class Zad3 {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    System.out.print("Podaj ile liczb wprowadzic ");
    int n = scanner.nextInt();
    int[] array = new int[n];

    for(int i = 0; i < n; i++) {
        System.out.println("Podaj " + (i + 1) + ". liczbe ");
        array[i] = scanner.nextInt();
    }

        Arrays.sort(array);
    System.out.println(Arrays.toString(array));

        int maxNumber = array[0];
        int maxQuantity = 1;
        int currentCuantity = 1;


        for(int i = 1; i < n ; i++){
            if(currentCuantity > maxQuantity){
                maxQuantity = currentCuantity;
                maxNumber = array[i-1];

            }

        if (array[i] == array[i-1]) {
            currentCuantity++;
        }
        else
            currentCuantity = 1;
        }




   System.out.println("Liczba "+maxNumber+" wystepuje "+maxQuantity+ " razy");

}
}
