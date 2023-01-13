import java.util.Arrays;

public class ArraySort{
    public static void main(String[] args) {
        
        int[] numbers = {4, 2, 56, 6, 42, 23, 7};
        Arrays.sort(numbers);
        String result = Arrays.toString(numbers);
        System.out.println(result);

        System.out.println("Smallest Number: " + numbers[0]);
        System.out.println("Biggest Number: " + numbers[6]);

    }
}