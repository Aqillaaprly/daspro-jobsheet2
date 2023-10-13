import java.util.Scanner;

public class Selection2Exp204 {

    public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);

    int angle1, angle2, angle3, totalAngle;

    System.out.print("Input Angle 1 : ");
    angle1 = input04.nextInt();
    System.out.print("Input Angle 2 : ");
    angle2 = input04.nextInt();
    System.out.print("Input Angle 3 : ");
    angle3 =  input04.nextInt();
    totalAngle = angle1+angle2+angle3;
    System.out.print("Total Angle : "+totalAngle);

    if(totalAngle == 180)
        if(angle1==90 || angle2==90 || angle3==90){
            System.out.println("Right triangle");
        }else if(angle1==angle2 && angle2==angle3 ){
            System.out.println("Equilateral triangle");
        }else if(angle1==angle2 || angle2==angle3 || angle1==angle3){
            System.out.println("Isosceles triangle");
        
    }else
        System.out.println("Not a triangle"); 
    }
    
}
