package learn_string;

import java.util.Arrays;

public class ReverseElementArray {
   public static int[]getReverse(){
       int[] reverse={1,2,3,4,5,6};
       int[] reversed=new int[reverse.length];
       for (int i=0; i< reverse.length; i++){
        reversed[i]= reverse[reverse.length -1 -i];
       }
       return reversed;
   }
    public static void main(String[] args) {
        int[] reversedA= ReverseElementArray.getReverse();
        System.out.println(Arrays.toString(reversedA));
    }
    }

