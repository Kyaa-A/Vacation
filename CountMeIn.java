import java.util.ArrayList;

public class CountMeIn {
    public static void main(String[] args) {

        String word = "aaaBbbbBBBbcc";
        String outcome = word.toLowerCase();

        System.out.println(outcome);

        ArrayList<Character> alphabet = new ArrayList<>();
        

        for (int i = 0; i < outcome.length(); i++) {
            for (int j = 0; j < outcome.length(); j++) {
                if (outcome.charAt(i) != alphabet.get(i)) {
                    alphabet.add(outcome.charAt(i));
                }
            }
        }
        System.out.println(alphabet);

    }
}
