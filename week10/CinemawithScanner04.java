import java.util.Scanner;

public class CinemawithScanner04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row, column;
        String name, next;
        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Enter a name: ");
                        name = sc.nextLine();
                        System.out.print("Enter row number: ");
                        row = sc.nextInt();
                        System.out.print("Enter column number: ");
                        column = sc.nextInt();
                        sc.nextLine();

                        if (isValidSeat(row, column, audience)) {
                            if (audience[row - 1][column - 1] == null) {
                                audience[row - 1][column - 1] = name;
                            } else {
                                System.out.println("Seat already occupied by another audience. Please select another seat.");
                                continue;
                            }
                        } else {
                            System.out.println("Seat row/column number is not available!");
                            continue;
                        }

                        System.out.print("Are there any other audiences to be added? (y/n): ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < audience.length; i++) {
                        System.out.print("Audience in row " + (i + 1) + ": ");
                        for (int j = 0; j < audience[i].length; j++) {
                            if (audience[i][j] != null) {
                                System.out.print(audience[i][j]);
                            } else {
                                System.out.print("***");
                            }
                            if (j < audience[i].length - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    
                    System.out.println("Exiting the program...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid menu option.");
            }
        }
    }


    public static boolean isValidSeat(int row, int column, String[][] audience) {
        return row >= 1 && row <= audience.length && column >= 1 && column <= audience[0].length;
    }
}
