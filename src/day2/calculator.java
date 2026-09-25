package day2;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int a,b,sum,sub,mul,div;
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first value");
        a = input.nextInt();

        System.out.println("enter your second value");
        b = input.nextInt();

        sum =a+b;
        sub= a-b;
        mul = a*b;
        div = a/b;

        System.out.println("the sum is : " + sum);
        System.out.println("the sub is : " + sub);
        System.out.println("the multiplication is : " + mul);
        System.out.println("the division is : " + div);

    }
}

