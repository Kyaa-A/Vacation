public class ArrayByTwo{
    public static void main(String[] args) {
        
        int arr[] = {42,1,5,7,23,4,2,54};

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