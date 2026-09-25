package day2;

import java.util.Scanner;
// sum of two sides of triangle must be greater than third
class AreaOfTriangle{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1, side2, side3, semi_perimeter;
        System.out.println("enter your three sides : ");
        side1 = sc.nextDouble();
        side2 = sc.nextDouble();
        side3 = sc.nextDouble();
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            semi_perimeter = (side1 + side2 + side3) / 2;
            double triangle_area = Math.sqrt(semi_perimeter * (semi_perimeter - side1) * (semi_perimeter - side2) * (semi_perimeter - side3));
            System.out.println("Area: " + triangle_area);
        } else {
            // Added an else block so the user knows why nothing printed
            System.out.println("Invalid sides! These lengths cannot form a triangle.");
        }
    }
}