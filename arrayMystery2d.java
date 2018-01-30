import java.util.*;
public class arrayMystery2d {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        int [][] numbers = {
            {3, 4, 5, 6},
            {4, 5, 6, 7},
            {5, 6, 7, 8}
        };
        System.out.println(Arrays.deepToString(numbers));
        mystry2d(numbers);
        System.out.println(Arrays.deepToString(numbers));
    }
    public static void mystry2d(int[][] a){
        for (int r = 0; r < a.length; r++){
            for (int c = 0; c < a[0].length - 1; c++){
                if (a[r][c + 1] > a[r][c]){
                    a[r][c] = a[r][c + 1];
                }
            }
        }
    }
}

