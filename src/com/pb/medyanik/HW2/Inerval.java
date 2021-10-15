package com.pb.medyanik.HW2;

import java.util.Scanner;

public class Inerval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A;
        System.out.println("Введите любое число:");
        A = scan.nextInt();
        if (A >= 0 && A <= 14) {
            System.out.println("[0-14]");
        }
        if (A >= 15 && A <= 35) {
            System.out.println("[15-35]");
        }
        if (A >= 36 && A <= 50) {
            System.out.println("[36-50]");
        }
        if (A >= 51 && A <= 100) {
            System.out.println("[51-100]");
        }
        if (A >100) {
            System.out.println("Нет подходящего диапозона");
        }
    }
}