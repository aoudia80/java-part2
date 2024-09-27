package learn_methods;

import java.util.Scanner;

public class ContainChar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the word");
        String word = scanner.nextLine();

        System.out.println("enter the letter");
        char letter = scanner.next().charAt(0);


        if (word.contains(String.valueOf(letter))){
            System.out.println("yes it contains the letter " + letter);

        }else {
            System.out.println("It doesn't contain the letter  " + letter);
        }
       }

}
