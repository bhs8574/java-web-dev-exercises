package exercises;

import java.util.Scanner;

public class AliceExtended {

    public static void main(String[] args) {
        int indexOfTerm;
        int lengthOfTerm;

        Scanner input = new Scanner(System.in);
        String firstSentence = "Alice was beginning " +
                "to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book " +
                "her sister was reading, but it had no pictures " +
                "or conversations in it, 'and what is the use of a " +
                "book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Hello, please enter a term to search for: ");
        String term = input.nextLine();
        indexOfTerm = firstSentence.toLowerCase().indexOf(term.toLowerCase());
        lengthOfTerm = term.length();
        System.out.println("The term " + term + " has been found at index: " + indexOfTerm + " " +
                "and has a length of: " + term.length() + ".");
        input.close();
        String editedSentence = firstSentence.substring(0, indexOfTerm) + firstSentence.substring(indexOfTerm+lengthOfTerm, firstSentence.length());
        System.out.println("After removing the term, the new first sentence is: ");
        System.out.println(editedSentence);
    }

}
