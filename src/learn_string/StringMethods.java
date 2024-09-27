package learn_string;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str= "aksil";
        String str2="d";
        char strIndex=str.charAt(3);
        System.out.println(strIndex);
        // substring method
        String subString=str.substring(1,4);
        System.out.println(subString);

        //equal method
        Boolean isEqual=str.equals(str2);
        System.out.println(isEqual);

        //equal empty
        Boolean isEmpty=str2.isEmpty();
        System.out.println(isEmpty);

        String sentence="this is a java programming";
       String word[]= sentence.split(" ");
       for (String element : word){
           System.out.println(element);
       }
       System.out.println(Arrays.toString(word));
    }
}
