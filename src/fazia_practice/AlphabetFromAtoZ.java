package fazia_practice;

public class AlphabetFromAtoZ {public void PintAlphabetOrder(char ch,char al) {
    for (char i = 'a'; i <= 'z'; i++) {
        System.out.println(i);
    }
}
    public static void main(String[] args) {
        AlphabetFromAtoZ alphabetFromAtoZ = new AlphabetFromAtoZ();
        alphabetFromAtoZ.PintAlphabetOrder('a','z');
    }
}



