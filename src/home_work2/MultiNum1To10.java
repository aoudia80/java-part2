package home_work2;
public class MultiNum1To10 {
    //Write a program to find multiplication of all natural numbers between
    //1 and 10
    public void multiNumbers() {
        int mult = 1; // initialize variable 'mult' to store the product
        for (int i = 1; i <= 10; i++) {
            mult=mult* i;// multiply 'mult' by 'i' for each iteration
        }
        System.out.println(mult); // print the final product after the loop
    }
    public static void main(String[] args) {
        MultiNum1To10 multiNum1To10 = new MultiNum1To10();// create an instance of class
        multiNum1To10.multiNumbers();// call the method to calculate the product from 1 to 10
    }
}
