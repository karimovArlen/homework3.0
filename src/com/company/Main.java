package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double passiveNum = 0;
        int sum = 0;
        double[] just = {2.3, 1.3, 2.4, -4.5, 3.6, -1.1, 2.1, 7.3, -8.9, 2.7, 9.2, 0.4, 7.3, 20.3, -4.7};
        for (double each : just) {
            if (each > 0) {
                passiveNum += each;
                sum++;
            }
        }
        System.out.println((float) passiveNum / sum);
        bubbleSort(just);
    }

    static void bubbleSort(double arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
