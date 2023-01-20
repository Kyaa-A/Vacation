public class ArrayByTwo{
    public static void main(String[] args) {
        
        int arr[] = {12, 23, 120, 60, 320, 45, 93, 21, 60};
        
        System.out.print("Elements are: ");
        for (int i = 0; i < arr.length; i+=2) {
            if(i>0){
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}