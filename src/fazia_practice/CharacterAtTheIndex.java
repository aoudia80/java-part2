package fazia_practice;
// string Homework
public class CharacterAtTheIndex {
    public static void main(String[] args) {
    int index= 3;
    String str = "great job";
    if (index >= 0 && index < str.length()) {
        char character = str.charAt(index);
        System.out.println("Character at index " + index + ": " + character);
    } else {
        System.out.println("Index out of bounds. Please enter a valid index.");
    }



}

}


