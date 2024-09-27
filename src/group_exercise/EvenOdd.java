package group_exercise;

public class EvenOdd {
    public void isEvenOrOdd(int n){
        if (n%2==0){
            System.out.println(n+" is even");
        }else{
            System.out.println(n+" is odd");
        }
    }
    public static void main(String[] args) {
        EvenOdd evenOdd= new EvenOdd();
        evenOdd.isEvenOrOdd(6);
    }
}
