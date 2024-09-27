package home_work2;

public class TenNaturalNumReverse {
    //Write a Java program to display the first 10 natural numbers in
//reverse
    public void reverseNum() {
        for (int i = 10; i >= 0; i--) { // loop from 10 to 0
            System.out.println(i); // print the current number
        }
    }
    public static void main(String[] args) {
        TenNaturalNumReverse tenNaturalNumReverse = new TenNaturalNumReverse(); // create an instance of a class
        tenNaturalNumReverse.reverseNum(); // call the method to print the number from 10 to 0
    }
}
