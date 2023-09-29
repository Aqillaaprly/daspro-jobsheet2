import java.util.Scanner;

public class Selection104{

    public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);
    System.out.print("Input a number = ");
    int number = input04.nextInt();
    if(number%2 == 0) {
        System.out.println(number+" is an even number!");
}else {
    System.out.println(number+" is an odd number!");
}      
    } 
}