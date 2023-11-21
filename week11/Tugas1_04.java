import java.util.Scanner;

public class Tugas1_04 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input N : ");
    int N = sc.nextInt();

    for ( int i = 1; i <= N; i++){
        for (int j = 1; j <= N -i; j++ ){
            System.out.print(" ");
        }
        for (int k = 1; k <=i; k++){
            System.out.print(k);
        }
        System.out.println();
    }
    }
}
