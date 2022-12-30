public class BasicPattern {

    public static void main(String[] args) {

        int num = 5;

        System.out.println("\nFirst Pattern\n");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nSecond Pattern\n");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        String add = "";
        System.out.println("\nThird Pattern\n");

        System.out.println("* ");
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 3; j++) {
                System.out.print(" ");
            }
            add = "*";
            for (int j = 1; j <= i; j++) {
            add += "*";
            }
            System.out.println(add);
        }
    }
}
