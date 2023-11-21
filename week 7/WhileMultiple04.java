    import java.util.Scanner;

public class WhileMultiple04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int multiple, sum = 0, counter = 0;
        System.out.print("Input the multiple = ");
        multiple = input.nextInt();
        int i = 1; 

        while (i <= 50) {
            if (i % multiple == 0) {
                sum += i;
                counter++;
                // System.out.print(i + "-");
            }
        i++; 
        }
        if (counter > 0) {
            double average = (double) sum / counter; // Calculate the average
            System.out.printf("There are %d numbers that are multiples of %d in range 1 to 50.\n", counter, multiple);
            System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d.\n", multiple, sum);
            System.out.printf("The average of all multiples of %d in range 1 to 50 is %.2f.\n", multiple, average);
        } else {
            System.out.printf("There are no multiples of %d in the range 1 to 50.\n", multiple);
        }
        input.close(); 
    }
}

