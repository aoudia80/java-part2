package home_work2;

public class OddNum0To20 {
    //write java program to display the odd number from 0 to 20

    public void isOddNumber(){
        for (int i=0; i<=20;i++){ //loop through numbers from 0 to 20
            if (i%2!=0) // check if the number is odd
            System.out.print(i+","); // print the odd numbers followed by a comma
        }
    }
    public static void main(String[] args) {
        OddNum0To20 oddNum0To20= new OddNum0To20(); // create an instance of a class
        oddNum0To20.isOddNumber(); // call the method to print the odd numbers from 0 to 20
    }

}
