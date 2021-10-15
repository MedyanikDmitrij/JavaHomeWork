package com.pb.medyanik.HW2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A;
        int B;
        String sign;
        System.out.println("Введите первое число:");
        A = scan.nextInt();
        System.out.println("Введите второе число:");
        B = scan.nextInt();
        System.out.println("введите операцию");
        sign = scan.next();
        switch (sign) {
            case "+":
                System.out.println(A + B);
                break;
            case "-":
                System.out.println(A - B);
                break;
            case "*":
                System.out.println(A * B);
                break;
            case "/":
                if (B == 0){
                    System.out.println("на ноль делить нельзя"); }
                else {System.out.println(A / B);}
                break;
            default:
                System.out.println("Ошибка ввода");
        }
    }
}