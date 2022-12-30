import java.io.*;

public class PrintGreatestNum {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int largestNum;

        System.out.print("Input First Number: ");
        int firstNum = Integer.parseInt(br.readLine());

        System.out.print("Input Second Number: ");
        int secondNum = Integer.parseInt(br.readLine());

        System.out.print("Input Third Number: ");
        int thirdNum = Integer.parseInt(br.readLine());

        if(firstNum > secondNum){
            secondNum = firstNum;
        }
        if(secondNum > thirdNum){
            thirdNum = secondNum;
        }
        largestNum = thirdNum;
        System.out.println(largestNum);
    }
}
