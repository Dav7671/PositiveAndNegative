package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[]{0,-5,4,-2,5,-3,0};
        System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        boolean foo = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] * arr[i + 1] > 0 ){
                foo = false;
                break;
            }
        }
        System.out.println(foo);
    }
}
