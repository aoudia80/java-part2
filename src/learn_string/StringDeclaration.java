package learn_string;

import java.net.StandardSocketOptions;
import java.util.Locale;

public class StringDeclaration {
    public static void main(String[] args) {
        String str1="hello";

        String str2="student";
        // the length method
        int strLength=str1.length();// it will return the number of character
        System.out.println(strLength);

        //concatenation method
       String strConcat= str1.concat(""+str2);
       System.out.println(strConcat);
    }
}
