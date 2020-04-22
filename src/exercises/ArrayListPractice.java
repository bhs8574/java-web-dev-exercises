package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    //Static method that uses a for each to add all values in
    //an ArrayList to the value sum, which starts at 0, and then returns sum.
    public static int findArrayListSum(ArrayList<Integer> numberList) {
        int sum = 0;

        for(Integer value: numberList) {
            sum += value;
        }

        return sum;
    }

    //Takes an Array List of strings as input, and uses a for each loop to
    //check every entry with an if statement.  If the string is length 5,
    //it prints that string.
    public static void printWordsWithFiveLetters(ArrayList<String> wordList) {
        for (String word: wordList) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }

    //Modified PrintWordsWithFiveLetters method to let the user input the
    //word length to print.  Uses the scanner for input, and sets the
    //comparison variable in the if statement to the number entered
    public static void printWords(ArrayList<String> wordList) {
        Scanner input = new Scanner(System.in);
        //Does not try to validate input, but a while in a dowhile loop
        //or a try catch statement in a while/dowhile loop would work for
        //that, like in studio 1.
        System.out.println("Enter an integer for word length to search for: ");
        int wordLength = input.nextInt();
        for (String word: wordList) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
        input.close();
    }

    public static void main(String[] args) {
        //Creates an empty array list of integers
        ArrayList<Integer> practiceList = new ArrayList<>();

        //Adds the values 0 through 14 to the array list.
        for (int i = 0; i < 15; i++) {
            practiceList.add(i);
        }

        //calling my findArrayListSum methods on the integer list and printing
        //the result
        System.out.println(findArrayListSum(practiceList));

        //The string from ArrayPractice
        String seussString = "I would not, could not, in a " +
                "box. I would not, could not with a fox. I will " +
                "not eat them in a house. I will not eat them with a mouse.";

        //Convert seussString to an ArrayList of words. This solution makes sense
        //to me. Split the string up into an array of words, then make a new
        //ArrayList and use a for each loop to add each array entry to the arraylist
        String[] seussArray = seussString.split("[ .,]");
        ArrayList<String> seussArrayList = new ArrayList<>();
        for(String word : seussArray) {
            seussArrayList.add(word);
        }

        //Testing my word search methods:
        printWordsWithFiveLetters(seussArrayList);
        printWords(seussArrayList);


    }

}
