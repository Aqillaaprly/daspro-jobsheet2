import java.util.Scanner;
import java.util.Random;

public class Quiz04 {
    
    public static void main(String[] args) {
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    char menu = 'y';
    do{
        int number = random.nextInt(10) + 1;
        boolean success = false;
        do{
            System.out.print("Guess the number(1-10)");
            int answer = sc.nextInt();
            sc.nextLine();

            if(answer == number) {
                success = (answer == number);
            } else {
                System.out.println("Your answer " + (answer < number ? "smaller" : "bigger") + "From the right number.");
            }
        } while(!success);
         System.out.print("Do you want to play again (Y/y) ? ");
         menu = sc.nextLine().charAt(0);
    }while(menu =='y' || menu == 'Y');
 
 }

}
