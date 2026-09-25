package day2;

import java.util.Scanner;

class Swap{
    static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int a,b,temp;
        System.out.println("enter your two integer value ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("before swap value of a : " + a +  " and b is : " +b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("after swap value of a : " + a + " and b is : " +b);
    }
}