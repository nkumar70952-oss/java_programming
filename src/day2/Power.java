package day2;
import java.lang.Math;
import java.util.Scanner;
// by default pow method use double data type
class Power{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base,exponent;
        System.out.println("enter your base and exponent :");
        base = sc.nextDouble();
        exponent = sc.nextDouble();
        double power = Math.pow(base,exponent);
        System.out.println(power);
    }
}
