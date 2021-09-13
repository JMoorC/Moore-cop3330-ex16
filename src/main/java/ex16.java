/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = inScan.nextInt();
        String answer = (age >= 16)? "You are old enough to legally drive." :
                "You are not old enough to legally drive.";

        System.out.println(answer);
    }
}
