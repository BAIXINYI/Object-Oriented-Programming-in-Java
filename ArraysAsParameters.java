import java.util.*;
public class ArraysAsParameters {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program double the strings you input.");
        System.out.println("How many numbers do you want to input?");
        int num = input.nextInt();
        int [] x = new int[num];
        for (int i = 0; i < x.length; i++){
            System.out.print("Number" + (i+1) +" : ");
            x[i] = input.nextInt();
        }
        
        System.out.println(Arrays.toString(x));
        doubleString(x);
        System.out.println(Arrays.toString(x));
    }
    
    public static void doubleString (int[] a) {
        for (int i =  0; i < a.length; i++) {
            a[i] = a[i] * 2;
        }
    }
    
}

