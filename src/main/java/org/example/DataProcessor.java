package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class DataProcessor {
    public static void main(String[] args) {
        int[] data = {38, -15, 72, 0, -42, 19, -63, 50, 27, -84, 61, 5};
        Arrays.sort(data);

        System.out.println("Data yang sudah diurutkan:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai yang ingin dicari indexnya: ");
        int targetValue = scanner.nextInt();

        int index = Arrays.binarySearch(data, targetValue);
        if (index >= 0) {
            System.out.println("Nilai ditemukan di index: " + index);
        } else {
            System.out.println("Nilai tidak ditemukan.");
        }

        int positiveCount = countPositiveElements(data);
        int negativeCount = countNegativeElements(data);
        int zeroCount = countZeroElements(data);

        System.out.println("Jumlah elemen dengan nilai positif: " + positiveCount);
        System.out.println("Jumlah elemen dengan nilai negatif: " + negativeCount);
        System.out.println("Jumlah elemen dengan nilai nol: " + zeroCount);
    }

    private static int countPositiveElements(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    private static int countNegativeElements(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }

    private static int countZeroElements(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num == 0) {
                count++;
            }
        }
        return count;
    }
}
