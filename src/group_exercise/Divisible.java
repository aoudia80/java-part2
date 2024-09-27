package group_exercise;

import javax.imageio.stream.ImageInputStream;

public class Divisible {
    //write a java method that return if a number is divisible by 5
    public boolean isDivisibleBy5(int n) {
        if (n % 6 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Divisible divisible=new Divisible();
        boolean isDiv=divisible.isDivisibleBy5(11);
        System.out.println(isDiv);
    }
}
