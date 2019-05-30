// print all numbers from 1 to 100 witch are divided by 3 without remainder

package com.Less3Task2package;

public class Digits {

    public static void main(String[] args) {

        int div = 3;

        System.out.print("\nSuch numbers are divided by " + div + " without remainder: ");
        for (int i = 1; i <= 100; i ++){
            if ((i%div) == 0){
                System.out.print(i + " ");
            }
        }
    }
}
