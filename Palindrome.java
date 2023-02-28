import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String reverseStr = "";

        System.out.print("Input a word: ");
        String word = scan.nextLine();
        int wordLength = word.length();

        for (int i = (wordLength - 1); i >= 0; i--) {
            reverseStr = reverseStr + word.charAt(i);
        }

        if (word.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(word + " is a Palindrome String");
        } else {
            System.out.println(word + " is not a Palindrome String");
        }

    }
}