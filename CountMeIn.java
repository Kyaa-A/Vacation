import java.util.Scanner;
import java.util.ArrayList;

public class CountMeIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Character> charList = new ArrayList<>();
        ArrayList<Integer> countList = new ArrayList<>();

        System.out.print("Sample Input: ");
        String input = scan.nextLine();
        String inputLowerCase = input.toLowerCase();

        for (int i = 0; i < inputLowerCase.length(); i++) {
            char c = inputLowerCase.charAt(i);

            int index = charList.indexOf(c);
            if (index >= 0) {
                countList.set(index, countList.get(index) + 1);
            } else {
                charList.add(c);
                countList.add(1);
            }
        }

        System.out.println(charList);
        System.out.println(countList);

        int maxIndex = 0;
        for (int i = 1; i < countList.size(); i++) {
            if (countList.get(i) > countList.get(maxIndex)) {
                maxIndex = i;
            }
        }

        char maxChar = charList.get(maxIndex);

        String maxCharString = Character.toString(maxChar);
        System.out.println("Sample output: " + maxCharString);

    }
}
