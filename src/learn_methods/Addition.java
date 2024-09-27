package learn_methods;

public class Addition {
    public int add(int a, int b) {
        int sum = (a + b);
        return sum;
    }
    public static void main(String[] args) {
        Addition addition=new Addition();
        int y=addition.add(5,8);
        System.out.println(y);
    }

}
