import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void OpenFile(String myFile) throws IOException{
        File myObj = new File(myFile);
        try{
            /* Scanner myReader = new Scanner(myObj);
            /* System.out.println("====File Content====");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            } */
            BufferedReader myReader = new BufferedReader(new FileReader (myObj));
            String data;
            System.out.println("====File Content====");
            while ((data=myReader.readLine())!=null) {
                System.out.println(data);
            }
            System.out.println("====File Information====");
            if(myObj.exists()){
                System.out.println("File name: " + myObj.getName());
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
                System.out.println("Writable: " + myObj.canWrite());
                System.out.println("Readable: " + myObj.canRead());
                System.out.println("File size in byte: " + myObj.length());


            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("What File you want to open? ");
        String myFile = sc.next();
        OpenFile(myFile);
    }
}