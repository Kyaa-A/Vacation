import java.io.*;

public class OddOrEven {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        if (num % 2 == 0) {
            System.out.printf("%d is an Even number", num);
        } else if (num % 2 != 0) {
            System.out.printf("%d is an Odd number", num);
        }
        System.out.println();
    }
}