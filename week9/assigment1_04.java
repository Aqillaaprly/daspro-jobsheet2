import java.util.Scanner;

public class assigment1_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int numElements = sc.nextInt();

        int[] numbers = new int[numElements];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numElements; i++) {
            numbers[i] = sc.nextInt();
        }
        int highest = numbers[0];
        for (int i = 1; i < numElements; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }
        int lowest = numbers[0];
        for (int i = 1; i < numElements; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numElements;

        System.out.println("Highest value: " + highest);
        System.out.println("Lowest value: " + lowest);
        System.out.println("Average value: " + average);
    }
}
