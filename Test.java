import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        String input = "bbbcAaaaaaaadDDDDDdDDDDDdddeeee";
        ArrayList<Character> charList = new ArrayList<Character>();
        ArrayList<Integer> countList = new ArrayList<Integer>();

        // Convert the input string to lowercase
        String inputLowerCase = input.toLowerCase();

        // Loop through the characters in the input string
        for (int i = 0; i < inputLowerCase.length(); i++) {
            char c = inputLowerCase.charAt(i);

            // If the character is not a letter, skip it
            if (!Character.isLetter(c)) {
                continue;
            }

            // If the character is already in the list, increment its count
            int index = charList.indexOf(c);
            if (index >= 0) {
                countList.set(index, countList.get(index) + 1);
            }
            // Otherwise, add the character to the list with a count of 1
            else {
                charList.add(c);
                countList.add(1);
            }
        }

        // Find the index of the character with the highest count
        int maxIndex = 0;
        for (int i = 1; i < countList.size(); i++) {
            if (countList.get(i) > countList.get(maxIndex)) {
                maxIndex = i;
            }
        }

        // Get the character with the highest count
        char maxChar = charList.get(maxIndex);

        // Convert the character to a string and display it
        String maxCharString = Character.toString(maxChar);
        System.out.println(maxCharString);
    }
}