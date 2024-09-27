package home_work2;

public class EvenNumber10To30 {
    //3 : write java program to display the even number from 10 to 30
    public void isEven(){
        for (int i=10; i<=30;i++){ // loop through numbers from 10 to 30
            if (i%2==0) // check if the number is even
            System.out.print(i+","); // print the number even followed by comma
        }
    }
    public static void main(String[] args) {
        EvenNumber10To30 evenNumber10To30=new EvenNumber10To30(); // create an instance of class
        evenNumber10To30.isEven(); // call the method to print even numbers between 10 and 30
    }
}
