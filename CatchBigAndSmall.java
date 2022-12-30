public class CatchBigAndSmall {
    public static void main(String[] args) {

        int container[] = { 42, 3, 76, 25, 12, 5 };
        int max = container[0];
        int small = container[0];

        for (int i = 0; i < container.length; i++) {
            if (container[i] > max) { // Container 42 3 76 25 12 5
                max = container[i]; // Largest 42 42 42 76 76 76
            }
            if (container[i] < small) { // Container 42 3 76 25 12 5
                small = container[i]; // Smallest 3 3 3 3 3 3
            }
        }
        System.out.printf("The Largest Number: %d \n", max);
        System.out.printf("The Smallest Number: %d \n", small);
    }
}