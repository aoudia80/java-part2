package learn_string;

public class switchGrades {
    public static void main(String[] args) {
        // using switch
        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
//        int avg = 30;
//        if (avg >= 80 && avg <= 100) {
//            System.out.println("the grad is a");
//        } else if (avg >= 60 && avg <= 79) {
//            System.out.println("the grad is b");
//        } else if (avg >= 40 && avg <= 59) {
//            System.out.println("the grad is c");
//        } else if (avg < 40) {
//            System.out.println("the grad is d");
//        }

    }

}
