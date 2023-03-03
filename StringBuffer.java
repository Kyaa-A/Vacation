import java.io.*;
public class StringBuffer {
    public StringBuffer(String string) {
    }

    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("Geeksfor");

        str.append("Geeks");
               

        System.out.println(str.toString());
        System.out.println(str.capacity());
        System.out.println(str.length());
        System.out.println(str.reverse());

    }
}
