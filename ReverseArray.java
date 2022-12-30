public class ReverseArray{
    public static void main(String[] args) {
        
        int arr[] = {42,1,5,7,23,4,2,54};

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