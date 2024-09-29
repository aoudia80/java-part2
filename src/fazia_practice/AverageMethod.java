package fazia_practice;

public class AverageMethod {
    public int getAverage() {
        int[] num = {2, 3, 4, 5, 6, 7, 8, 9};
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println(sum / num.length);

        double avg = sum / num.length;
        return (int) sum / num.length;
    }

    public static void main(String[] args) {
        AverageMethod averageMethod = new AverageMethod();
        int avg = averageMethod.getAverage();


    }
}
