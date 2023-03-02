import java.util.Scanner;

public class Split {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = scan.nextLine();

        String[] splitName = name.split(" ");
        char container = splitName[1].charAt(splitName[1].indexOf("-") + 1);
        splitName[1] = Character.toString(container) + ".";

        for (int i = 0; i < splitName.length; i++) {
            System.out.print(splitName[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < splitName.length; i++) {
            System.out.print(splitName[i].charAt(0));
        }
        System.out.println();
    }
}