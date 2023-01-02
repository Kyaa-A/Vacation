import java.util.*;

import javax.sound.midi.Soundbank;

public class Multi {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        try {

            System.out.print("Search for name: ");
            String name = s.nextLine();
            System.out.println();

            System.out.println("=====Array=====\n");
            String arrayName[] = { "Asnari", "Kim", "Ace" };
            int arrayID[] = { 59891, 60307, 60000 };
            int i;
            for (i = 0; i < arrayName.length; i++) {
                if (name.equals(arrayName[i])) {
                    System.out.println("Name: " + name);
                    System.out.println("ID: " + arrayID[i]);
                    break;
                }
            }
            if (i == arrayName.length) {
                System.out.println("No Name Found");
            }

            System.out.println("\n=====ArrayList=====\n");
            ArrayList<String> listName = new ArrayList<>(Arrays.asList("Asnari", "Kim", "Ace"));
            ArrayList<Integer> listID = new ArrayList<>(Arrays.asList(59891, 60307, 60000));

            if (listName.contains(name)) {
                System.out.println("Name: " + name);
                System.out.println("ID: " + listID.get(listName.indexOf(name)));
            } else {
                System.out.println("No Name Found");
            }

            System.out.println("\n=====LinkedList=====\n");
            LinkedList<String> linkName = new LinkedList<>(Arrays.asList("Asnari", "Kim", "Ace"));
            LinkedList<Integer> linkID = new LinkedList<>(Arrays.asList(59891, 60307, 60000));

            if (linkName.contains(name)) {
                System.out.println("Name: " + name);
                System.out.println("ID: " + linkID.get(linkName.indexOf(name)));
            } else {
                System.out.println("No Name Found");
            }

            System.out.println("\n=====HashMap=====\n");
            HashMap<String, Integer> id = new HashMap<>();

            id.put("Asnari", 59891);
            id.put("Kim", 60307);
            id.put("Ace", 60000);

            if (id.containsKey(name)) {
                System.out.println("Name: " + name);
                System.out.println("ID: " + id.get(name));
            } else {
                System.out.println("No Name Found");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}