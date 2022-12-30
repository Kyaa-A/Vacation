public class SumOfArray {
    public static void main(String[] args) {
        
        int arr[] = {4,24,63,8,23,1,93,53,22,93,13,42};
        int sum = 0;

        System.out.print("Elements are: ");
        for (int i = 0; i < arr.length; i++) {
            if(i>0){
                System.out.print(", ");
            }
            System.out.print(arr[i]);
            sum += arr[i];
        }
        System.out.printf("\nTotal Sum: %d\n", sum);
    }
}
