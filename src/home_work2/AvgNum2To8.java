package home_work2;

public class AvgNum2To8 {
    //Write a program to find avg of all natural numbers between 2 and 8
    int sum = 0;// variable to store the sum of numbers
    int count = 0; // variable to store the count of numbers
    public void averageNumber() { // method to calculate and print the average of numbers between 2 and 8
        for (int i = 2; i <= 8; i++) {// loop from 2 to 8
            sum=sum+i; // add current number to the sum
            count++; // increment the count of numbers
        }
        double avg=sum/count; // calculate the average
        System.out.println(avg);// print the average
    }
        public static void main (String[]args){
            AvgNum2To8 avgNum2To8 = new AvgNum2To8();// create an object of AvgNum2To8
            avgNum2To8.averageNumber();// call the method to compute average
        }
    }



