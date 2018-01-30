import java.util.*;
import java.util.Arrays; 
public class MatrixAdd {
    public static void main(String args[]) {
	System.out.println("This program randomly create two 2D matrixs, then add the two matrix as a new matrix");
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimension of your matrixs.");
        System.out.print("Numbers of Row: ");
        int row = input.nextInt();
        System.out.print("Numbers of Coloumn: ");
        int col = input.nextInt();
        
        int [][] a = new int [row][col];
        int [][] b = new int [row][col];
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                a[i][j] = (int)(Math.random()*100);
                b[i][j] = (int)(Math.random()*100);
            }
        }
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(b));        
        int [][] c = matrixAdd(a, b);
    
	System.out.println(Arrays.deepToString(c));
	}
    public static int [][] matrixAdd(int[][] a, int[][] b){
        int[][] c = new int [a.length][a[0].length];
        for (int row = 0; row < a.length; row++){
            for (int col = 0; col < a[row].length; col++){
                c[row][col] = a[row][col] + b[row][col];
            }
        }
        return c;
    }
}

