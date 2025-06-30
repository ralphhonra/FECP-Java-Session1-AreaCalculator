package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Choose a shape (1-3): ");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println();
            System.out.print("Enter the radius: ");
            double radius = input.nextDouble();
            double area = calculateCircleArea(radius);
            System.out.println("Area of the circle: " + String.format("%.2f", area));
        }
        else if (choice == 2) {
            System.out.println();
            System.out.print("Enter the base: ");
            double base = input.nextDouble();
            System.out.print("Enter the height: ");
            double height = input.nextDouble();
            double area = calculateTriangleArea(base, height);
            System.out.println("Area of the triangle: " + String.format("%.2f", area));
        }
        else if (choice == 3) {
            System.out.println();
            System.out.print("Enter the length: ");
            double length = input.nextDouble();
            System.out.print("Enter the width: ");
            double width = input.nextDouble();
            double area = calculateRectangleArea(length, width);
            System.out.println("Area of the rectangle: " + String.format("%.2f", area));
        }
    }
}