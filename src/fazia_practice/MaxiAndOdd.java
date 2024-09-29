package fazia_practice;

public class MaxiAndOdd {
    public static void main(String[] args) {
        int a[][] = {{7, 8, 2}, {10, 100, 12,}, {60, 30, 1}};
        int min = a[0][0];
// search min
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }

        System.out.println(min);
        //Search max
        int max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
    }
}


