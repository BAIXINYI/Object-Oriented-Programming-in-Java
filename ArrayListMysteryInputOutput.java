import java.util.Arrays;
import java.util.*;
public class ArrayListMysteryInputOutput{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Please input your arraylist, end with 00");
        int i = input.nextInt();
        while(i != 00){
             list.add(i);
             i = input.nextInt();
        }
       
      System.out.println(list);
      mystery3(list);
        }
    public static void mystery3(ArrayList<Integer> list){
        for (int i = list.size() - 2; i > 0; i--){
            int a = list.get(i);
            int b = list.get(i + 1);
            list.set(i, a + b);
        }
        System.out.println(list);
    }
    
}

