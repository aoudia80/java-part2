package home_work2;

public class DivisableBy3N5 {
    //write java Program to print all the numbers divisible by 3 and 5 from 0 to 100

    public void isDivisible(){
        for (int i=0; i<=100;i++){// loop through numbers from 0 to 100
            if (i%3==0 && i%5==0)// check the number is divisible by both numbers 3 and 5
            System.out.print(i+",");// print the number followed by comma
        }
    }

    public static void main(String[] args) {
        DivisableBy3N5 divisableBy3N5= new DivisableBy3N5(); // create an instance of a class
        divisableBy3N5.isDivisible(); // call the method to print all the numbers divisible by 3 and 5
    }
}
