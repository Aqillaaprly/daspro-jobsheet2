package week3;

import java.util.Scanner;

public class Triangle04 {
public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    int base, height;
    float area;

    System.out.print("Input base: ");
    base=sc.nextInt();
    System.out.print("Input Height: ");
    height = sc.nextInt();

    area = (float) base * height / 2;

    System.out.println("Area of the triangle: " + area);
    }
}
