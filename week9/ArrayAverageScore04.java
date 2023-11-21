import java.util.Scanner;

public class ArrayAverageScore04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[10];
        double total = 0;
        double average;
        int passedCount = 0;
        double passedTotal = 0;
        int notPassedCount = 0;
        double notPassedTotal = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + ": ");
            score[i] = sc.nextInt();
        }

        for (int i = 0; i < score.length; i++) {
            total += score[i];
            if (score[i] > 70) {
                passedCount++;
                passedTotal += score[i];
            } else {
                notPassedCount++;
                notPassedTotal += score[i];
            }
        }

        average = total / score.length;
        System.out.println("The class average score is " + average);

        if (passedCount > 0) {
            double passedAverage = passedTotal / passedCount;
            System.out.println("Average score of passed students: " + passedAverage);
        } else {
            System.out.println("No student passed.");
        }

        if (notPassedCount > 0) {
            double notPassedAverage = notPassedTotal / notPassedCount;
            System.out.println("Average score of not passed students: " + notPassedAverage);
        } else {
            System.out.println("All students passed.");
        }
    }
}
