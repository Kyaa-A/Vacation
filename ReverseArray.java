public class ReverseArray{
    public static void main(String[] args) {
        
        int arr[] = {12, 23, 120, 60, 320, 45, 93, 21, 60};

        System.out.print("Elements are: ");
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]);
            if(i>0){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}