import java.util.Scanner;

public class linearsearch04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int numElements = sc.nextInt();

        int[] arrayInt = new int[numElements];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numElements; i++) {
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Enter the key you want to search for: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                System.out.println("The key " + key + " in the array is located at index position " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Key not found in the array.");
        }
    }
}
