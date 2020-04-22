package exercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        //create and initialize the array in a single line:
        int[] practiceArray = {1, 1, 2, 3, 5, 8};

        //Loop through the array to print each value:
        for (int value: practiceArray) {
            System.out.println(value);
        }

        //Same loop modified to print only odd numbers:
        for (int value: practiceArray) {
            if (value%2 != 0 ) {
                System.out.println(value);
            }
        }

        //Splitting a string up into an array full of one word elements:
        String seussString = "I would not, could not, in a " +
                "box. I would not, could not with a fox. I will " +
                "not eat them in a house. I will not eat them with a mouse.";
        String[] seussArray = seussString.split(" ");

        //Check to see if splitting the words up worked:
        System.out.println(Arrays.toString(seussArray));

        //Repeat the last exercise, but with each sentence instead of each word:
        String[] seussArray2 = seussString.split("\\.");
        System.out.println(Arrays.toString(seussArray2));

    }

}
