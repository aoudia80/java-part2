package home_work2;

public class NaturalNumber {
    //1 : Write a Java program to display the first 10 natural numbers.
    public void isNaturalNumber() {
        for (int i = 1; i <= 10; i++) {// loop through the numbers to get the first natural numbers
            System.out.print(i+ ","); // print each number followed wit comma
        }
    }
    public static void main(String[] args) {// main method to display the numbers
        NaturalNumber naturalNumber = new NaturalNumber();// create an instance of a class
        naturalNumber.isNaturalNumber();// call the method to display the natural numbers
    }
}



