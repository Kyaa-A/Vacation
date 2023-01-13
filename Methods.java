import java.util.Scanner;

public class Methods{

    //Test
    public static int sum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
    public static void sayHi(){
        System.out.println("Hi");
    }     
    public static void sayHi(String name){
        System.out.println("Hi " + name);
    }    
          
    
    
    //Exercise 1 (Enter Name and Age)

    public static String getName(){
        return new Scanner(System.in).nextLine();
    }
    public static int getAge(){
        return new Scanner(System.in).nextInt();
    }
    
    public static void main(String[] args) {
        System.out.println("Enter your Name and Age: ");
        System.out.println("You're " + getName() + " age " + getAge());

    }
}