import java.util.Scanner;

public class NestedLoop_2341720068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
        for(double[] cityTemps : temps) {
            for (double temp : cityTemps){
                System.out.print(temp + "");
            }
            System.out.println();
        }

        for(int i =0; i < temps.length; i++){
            double totalTemp = 0;
            for (int j = 0; j < temps[0].length; j++){
                totalTemp += temps[i][j];
            }
            double averageTemps = totalTemp / temps[0].length;
            System.out.println("Average : " + (i+1) + ": " + averageTemps);
        }




        /**for (int i = 0; i < temps.length; i++) {
            System.out.print("City " + (i + 1) + ": ");
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + "  ");
            }
            System.out.println();**/
        }
    }
