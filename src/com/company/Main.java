package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number with comma");
        double number=input.nextDouble();
        int digit=(int) number;
        System.out.println("Number:" + digit);

    }
}
