import java.util.Scanner;

public class Selection204 {
    
    public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);
    
    System.out.print("Final Exam     : ");
    float finalExam = input04.nextFloat();
    System.out.print("Middle Exam     : ");
    float midExam = input04.nextFloat();
    System.out.print("Quiz    : ");
    float quiz = input04.nextFloat();
    System.out.print("Assigment    : ");
    float assigment = input04.nextFloat();

    float total = (finalExam*0.4F) + (midExam*0.3F) + (quiz*0.1F) + (assigment*0.2F);
    String message = total < 65 ? "Retake" : "Pass";
    System.out.println("Final Grade = " + total + " and the decission is " + message);

    String predikat = " ";
    if (total > 80 && total <100 ) {
        predikat = "the predikat is A";
    } else if (total > 73 && total < 80 ) {
        predikat = "the predikat is B+";
    } else if (total > 65 && total < 73) {
        predikat = "the predikat is B";
    } else if (total > 60 && total < 65) {
        predikat = "the predikat is C+";
    } else if (total > 50 && total < 60) {
        predikat = "the predikat is C";
    } else if (total > 39 && total < 50) {
        predikat = "the predikat is D";
    } else {
        predikat = "the predikat is E";
    }
    System.out.println(predikat);
    }
}
