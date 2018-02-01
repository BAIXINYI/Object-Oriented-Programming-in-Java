import java.util.Arrays;
import java.util.*;
public class MaxLengthInArrayList{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program output the longest string you input in an ArrayList.");
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Please input your arraylist, end with end");
        String i = input.nextLine();
        while(!i.equals("end")){
             list.add(i);
             i = input.nextLine();
        }
       
      System.out.println("Your ArrayList: " + list);
      String max = maxLength(list);
      System.out.println("The Longest String: " + max);
        }
    public static String maxLength(ArrayList<String> list){
        String max;
        String a;
        int maxnum;
        int anum;
        if(list.size() == 0){
            max = "0" ;
        }
         max = list.get(0);
         maxnum = max.length();
        for (int i = 1 ; i < list.size(); i++){
            a = list.get(i);
            anum = a.length();
           if (anum > maxnum){
               max = a;
               maxnum = anum;
           }
        }
        return max;
    }
    
}

