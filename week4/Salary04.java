import java.util.Scanner;

public class Salary04{
  
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);

    int numAttendence, numAbsence, totalSalary, salary, salaryDeduction;

    System.out.println("Input attendence number: ");
    numAttendence = input.nextInt();
    System.out.println("Input absence number: ");
    numAbsence = input.nextInt();
    System.out.println("Input salary");
    salary = input.nextInt();
    System.out.println("Input salary deduction");
    salaryDeduction = input.nextInt();

    totalSalary=(numAttendence*salary)-(numAbsence*salary)-(salaryDeduction);
    System.out.println("Total salary:"+totalSalary);

    }

}