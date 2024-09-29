package fazia_practice;

public class PalindromString {public static boolean isPalindrom(String str) {
    String rev = "";
    for (int i = str.length() - 1; i >= 0; i--) {
        rev = rev + str.charAt(i);
    }
    return str.equals(rev);
}
    public static void main(String[] args) {
        boolean r = PalindromString.isPalindrom("radar");
        System.out.println(r);
    }
}


