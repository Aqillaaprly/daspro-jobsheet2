import java.util.Scanner;

public class DoWhileLeaveEntitlement04 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int leaveEntitlement, numLeave;
    String confirmation;

    System.out.print("leaveEntitlement");
    leaveEntitlement = input.nextInt();

    do{
        System.out.print("Apakah Anda ingin mengmabil cuti (y/t) ?");
        confirmation = input.next();
        
        if(confirmation.equalsIgnoreCase("y")) {
            System.out.println("The Day: ");
            numLeave = input.nextInt();

            if(numLeave <= leaveEntitlement){
                leaveEntitlement-= numLeave;
                System.out.println("leave day left : " +leaveEntitlement);
            } else {
                System.out.println("Your leave entitlement is not enough");
                break;
            }
        }
    }while (leaveEntitlement >0);

    }
    
}
