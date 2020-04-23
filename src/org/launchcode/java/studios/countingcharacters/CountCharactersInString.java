package org.launchcode.java.studios.countingcharacters;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountCharactersInString {

    /*
    This method takes in an array of characters, and creates a hashmap where the keys are every a-z character that
    appears in the array, and the value is the amount of times that value appears in the array.
     */
    public static Map<Character, Integer> mapCharsInArray(char[] charArray) {
        HashMap<Character, Integer> characterCounts = new HashMap<>();
        String charMatch;

        // This is a for-each loop that loops over every character in the array
        for(Character character : charArray) {
            charMatch = String.valueOf(character);

            //This if statement checks to see if a character is a through z, and moves on, skipping the
            //character if it isn't.
            if (charMatch.matches("[a-z]")) {

                /*
                IF: the hashmap does not yet have a key for the character, make the key and assign it 1.
                ELSE IF: the key exists, it means we've encountered the character at least once and are again, so
                increment the value.
                ELSE: We both have and don't have a key for the character, so something terrible has happened in our
                logic/code.
                 */
                if (!characterCounts.containsKey(character)) {
                    characterCounts.put(character, 1);
                } else if (characterCounts.containsKey(character)) {
                    characterCounts.compute(character, (key, val) -> val + 1);
                } else {
                    System.out.println("Something has gone terribly wrong in mapCharsInArray()!");
                }
            }
        }

        //return the hashmap of characters and their count we created.
        return characterCounts;
    }

    //This is a real quick method that takes a hashmap of <Character, Integer> and uses a for each loop
    //to print the entire map to the console in Key: value format.
    public static void printCharacterCountMap(Map<Character, Integer> characterCountMap) {
        for (Map.Entry<Character, Integer> character : characterCountMap.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue() );
        }
    }

    /*
    This method loads the sample string from the studio text into the sampleString variable, uses the
    code provided by the studio to convert a string into an array of chars, then calls the
    mapCharsInArray() method on the array to create a hashmap containing counts for each alphabetical character,
    and calls printCharacterCountMap() on the result to print the hashmap to the console.
     */
    public static void sampleStringCharacterCount() {
        String sampleString = "If the product of two " +
                "terms is zero then common sense says at " +
                "least one of the two terms has to be zero " +
                "to start with. So if you move all the terms " +
                "over to one side, you can put the quadratics" +
                " into a form that can be factored allowing" +
                " that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty " +
                "straightforward from there.";
        char[] charactersInString = sampleString.toLowerCase().toCharArray();
        printCharacterCountMap(mapCharsInArray(charactersInString));
    }

    //This method prompts the users to enter a string via the console, stores the string in userString, then
    //returns userString.
    public static String getUserString() {
        System.out.println("Please enter a String: ");
        Scanner stringInput = new Scanner(System.in);
        String userString;
        userString = stringInput.nextLine().toLowerCase();
        stringInput.close();
        return userString;
    }

    /*
    This method calls the getUserString method plugged into the provided code to turn a string into
    an array of chars to quickly get a string from the user and convert it to a char array, then calls the
    mapCharsInArray() method on the array to create a hashmap containing counts for each alphabetical character,
    and calls printCharacterCountMap() on the result to print the hashmap to the console.
     */
    public static void userStringCharacterCount() {
        char[] charactersInString = getUserString().toCharArray();
        printCharacterCountMap(mapCharsInArray(charactersInString));
    }

    /*
    This method, I'm honestly still unpacking exactly how I got it to work by frankensteining it together,
    but it reads in the contents of character_count.txt from the same folder as this class into a String, then
    performs the same steps to generate and print the hashmap as userStringCharacterCount() and sampleStringCharacterCount()
     */
    public static void countCharactersInFile() {
        String fileContents = "";

        URL path = CountCharactersInString.class.getResource("character_count.txt");
        // pass the path to the file as a parameter
        File file = null;
        try {
            file = new File(path.toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (sc.hasNextLine()) {
            fileContents = fileContents + sc.nextLine();
        }
        char[] charactersInString = fileContents.toCharArray();
        printCharacterCountMap(mapCharsInArray(charactersInString));
    }


    /*
    My main method.  Prompts the user to choose between evaluating the sample text, their own string, or the contents
    of character_count.txt in the same file as this class.
     */
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String userSelection;
        System.out.println("Hello! Please choose an option for counting characters: ");
        System.out.println("Enter 1 to evaluate a sample selection from Hidden Figures. \n" +
                "Enter 2 to type your own input for evaluation. \n" +
                "Enter 3 (or anything else) to read input from character_count.txt");
        userSelection = input.nextLine();

        /*
        IF: the user entered 1, call the method to evaluate the sample string.
        ELSE IF: the user entered 2, call the method to handle getting user input and evaluate it.
        ELSE: if the user entered anything but 1 or 2 when trimmed of whitespace, call the method to evaluate the file.
         */
        if (userSelection.trim().equals("1")) {
            sampleStringCharacterCount();
        } else if (userSelection.trim().equals("2")) {
            userStringCharacterCount();
        } else {
            countCharactersInFile();
        }
        input.close();
    }

}
