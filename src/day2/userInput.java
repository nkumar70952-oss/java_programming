package day2;

import java.util.Scanner;

class userInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("enter your two integers :");
        int a,b;      // variable declaration
        a = sc.nextInt();
        b = sc.nextInt();

        int sum = a+b;  // addition

        System.out.println("the sum is : " + sum);
    }
}
