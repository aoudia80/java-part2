package group_exercise;

public class calculator {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        String operation = "add";
        switch (operation) {
            case "add":
                System.out.println(a + b);
                break;
            case "sub":
                System.out.println(a - b);
                break;
            case "mult":
                System.out.println(a * b);
                break;
            case "div":
                System.out.println(a / b);
                break;
            default:
                System.out.println("invalid operation");

        }

    }
}
