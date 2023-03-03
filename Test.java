import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean valid = true;
        do {
            try {

                System.out.println("Enter int");
                int num = scan.nextInt();
                System.out.println(num);
                valid = true;
            } catch (Exception e) {
                scan.nextLine();
                System.out.println("Invalid, try again...");
                valid = false;
            }
        } while (!valid);
    }
}