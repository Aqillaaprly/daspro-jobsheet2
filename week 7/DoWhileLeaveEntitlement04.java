import java.util.Scanner;

public class DoWhileLeaveEntitlement04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int leaveEntitlement, numLeave;
        String confirmation;

        System.out.print("Leave Entitlement: ");
        leaveEntitlement = input.nextInt();

        do {
            System.out.print("You want to take a break (y/t)? ");
            confirmation = input.next();

            if (confirmation.equalsIgnoreCase("t")) {
                break; // Exit the loop when "t" is entered
            } else if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("The Day: ");
                numLeave = input.nextInt();

                while (numLeave > leaveEntitlement) {
                    System.out.println("Your leave entitlement is not enough. Available leave days: " + leaveEntitlement);
                    System.out.print("Please enter the number of leave days within your entitlement: ");
                    numLeave = input.nextInt();
                }

                leaveEntitlement -= numLeave;
                System.out.println("Leave days left: " + leaveEntitlement);
            } else {
                System.out.println("Invalid input. Please enter 'y' to continue or 't' to stop.");
            }
        } while (leaveEntitlement > 0);
    }
}
