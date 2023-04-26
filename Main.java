package com.GuessNo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int myNumber = (int)(Math.random()*10);
        int userNumber;

        do{
            System.out.print("Guess my Number : ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("Correct Guess");
                break;
            }
            else if (userNumber > myNumber) {
                System.out.println("your No. is Larger");
            }
            else {
                System.out.println("your No. is smaller");
            }
        } while (userNumber >= 0);

        System.out.print("My number was : ");
        System.out.println(myNumber);
    }
}