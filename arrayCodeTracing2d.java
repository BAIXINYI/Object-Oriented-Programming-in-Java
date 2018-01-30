import java.util.*;
public class arrayCodeTracing2d {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        int [][] numbers = new int [3][4];
        for (int r = 0; r < numbers.length; r++){
            for (int c = 0; c < numbers[0].length; c++){
                numbers[r][c] = r + c;
            }
        }
        System.out.println(Arrays.deepToString(numbers));
    }
    
}

