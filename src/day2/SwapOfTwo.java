package day2;

import java.util.Scanner;
// swap without using third variable
class SwapOfTwo{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("enter your two integers");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("before swap value of a : " + a +  " and b is : " +b);
        b = a+b;
        a = b-a;
        b = b-a;
        System.out.println("after swap value of a : " + a + " and b is : " +b);

    }
}