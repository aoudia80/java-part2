package home_work;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AlphabetOrNot {
    public static void main(String[] args) {
        char ch = '2';
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("is alphabet");
        } else {
            System.out.println("is not alphabet");
        }
    }

}



