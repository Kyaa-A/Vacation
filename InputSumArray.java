import java.io.*;

public class InputSumArray {
    ;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter any number [ " + i + " ]: ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("num [ " + i + " ]: " + arr[i]);
            total += arr[i];
        }
        System.out.println("SUM of all Array: " + total);
    }
}
