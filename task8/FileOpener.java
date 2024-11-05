package task8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileOpener {

    public static void ReadFile(FileReader file) throws IOException {

        try {
            file = new FileReader("C:/Users/Mohammad Parvez/Desktop/testfile.txt");

            Scanner scan = new Scanner(file);
//           while (true)
            while (scan.hasNext()) {
                System.out.println(scan.nextLine());
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found Exception : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Check for exception : " + e.getLocalizedMessage());
        }
        finally
        {

                file.close();

        }
    }
    public static void main(String[] args) {
        FileReader file = null;

        try {
            ReadFile(file);
        } catch (Exception e) {
            System.out.println("cant read file");
        }

    }
}