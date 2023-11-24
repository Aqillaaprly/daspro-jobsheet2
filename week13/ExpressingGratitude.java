import java.util.Scanner;

public class ExpressingGratitude{
    public static String getGreatingRecipient(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = sc.nextLine();
        sc.close();
        return recipientName;
    }

    public static void sayThankyou(){
        String name = getGreatingRecipient();
        System.out.println("Thank You " +name+  "  For being the best teacher in the world. \n" +
        "You inspired in me a love for learning and made me feel like I could ask you anything. ");
    }

    public static void main(String[] args) {
        sayThankyou();
    }
}