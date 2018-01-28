import java.util.*;
public class FixedGradeCalculator {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("This program calculates your grades.");
        System.out.println("How many grades would you like to enter?");
        int numGrades = input.nextInt();
        int[] myGrades = new int[numGrades];
        
        for (int i = 0; i < myGrades.length; i++ ){
            System.out.print("HW" + (i+1) + " score: ");
            myGrades[i] = input.nextInt();
        }
        int sum =0;
        for (int i = 0; i < myGrades.length; i++){
            sum += myGrades[i];
        }
        int avg = sum / myGrades.length;
        int aboveAvg = 0;
        for (int i = 0; i < myGrades.length; i++){
            if (myGrades[i] > avg){
                aboveAvg++;
            }
        }
        System.out.println("Average score = " + avg);
        System.out.println(aboveAvg + " HW were above your average");
    }
}

