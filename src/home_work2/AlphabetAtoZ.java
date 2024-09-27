package home_work2;
public class AlphabetAtoZ {
    public void alphabet(){
        char al='A'; // initialize al as a single character
        for (al='a';al<='z';al++){ // for loop to iterate through all the letters of the alphabet 'a' to 'z'
            System.out.print(al+",");// Print the current character value of 'al' followed by comma,
                                        // but without a new line
        }
    }
    public static void main(String[] args) {
        AlphabetAtoZ alphabetAtoZ=new AlphabetAtoZ();// Create an instance of the AlphabetAtoZ class
        alphabetAtoZ.alphabet();    // call the alphabet() method to print letters from A to Z
    }
}
