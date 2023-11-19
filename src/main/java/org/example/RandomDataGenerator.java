package org.example;

import java.util.Random;
import java.util.Scanner;

public class RandomDataGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Random Angka");
            System.out.println("2. Random String");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1/2/3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    generateRandomNumber(random, scanner);
                    break;
                case 2:
                    generateRandomString(random, scanner);
                    break;
                case 3:
                    System.out.println("Terima kasih, program berakhir.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }

    private static void generateRandomNumber(Random random, Scanner scanner) {
        System.out.print("Masukkan batas bawah angka acak: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Masukkan batas atas angka acak: ");
        int upperBound = scanner.nextInt();

        int randomNum = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        System.out.println("Angka acak: " + randomNum + "\n");
    }

    private static void generateRandomString(Random random, Scanner scanner) {
        System.out.print("Masukkan panjang string acak: ");
        int length = scanner.nextInt();

        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomChar = (char) (random.nextInt(26) + 'A');
            randomString.append(randomChar);
        }

        System.out.println("String acak: " + randomString.toString() + "\n");
    }
}

