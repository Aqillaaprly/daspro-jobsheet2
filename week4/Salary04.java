import java.util.Scanner;

public class Salary04{
  
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);

    int numAttendence, numAbsence, totalSalary;
    int salary=40000, salaryDeduction=25000;

    System.out.println("Input attendence number: ");
    numAttendence = input.nextInt();
    System.out.println("Input absence number: ");
    numAbsence = input.nextInt();

    totalSalary=(numAttendence*salary)-(numAbsence*salaryDeduction);
    System.out.println("Total salary:"+totalSalary);

    }

}