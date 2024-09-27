package home_work2;

public class SumNaturalNum1to10 {
    //Write a program to find sum of all natural numbers between 1 and 10
    public void sumNumber(){
        int sum=0; // initialize sum variable to store the total
        for (int i=0;i<=10;i++){// loop from 0 to 10 to calculate the sum
            sum=sum+i; // add the current number to sum
        }
        System.out.println(sum); // print the sum
    }
    public static void main(String[] args) {
        SumNaturalNum1to10 sumNaturalNum1to10=new SumNaturalNum1to10(); // create an instance of class
        sumNaturalNum1to10.sumNumber(); // call the method to compute and display the sum
    }
}
