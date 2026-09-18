package day2;

import java.util.Scanner;   // scanner class import

class myProgram {
    public static void main(String[] args) {

        //sc is a reference variable you can name whatever you want

        Scanner sc = new Scanner(System.in);// used for input
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}
