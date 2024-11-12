package task9;

import java.io.*;
import java.util.Scanner;

public class FileHandling {

    private static void createFile(String filename) throws IOException {

        File file = new File(filename);

        if (!file.exists()) {

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

                writer.write("HI\n");

                writer.write("HOW ARE YOU DOING \n");
                writer.close();
                System.out.println("File  created ");
                        }

    }


    private static void renameFile(String oldFileName, String newFileName) {

        File oldFile = new File(oldFileName);
        File newFile = new File(newFileName);

        if (oldFile.renameTo(newFile)) {

            System.out.println("File renamed " );

        } else {

            System.err.println("Failed to rename");

        }

    }

    private static int countWordsInFile(String filename) throws IOException {

        int wordCount = 0;

        BufferedReader reader = new BufferedReader(new FileReader(filename));

            String line;

            while ((line = reader.readLine()) != null) {

                wordCount += line.split("\\s+").length;

            }

            System.out.println("Word count ="+wordCount);

        return wordCount;

    }


    private static void writeWordCountToFile(String filename, int wordCount) throws IOException {

       BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

            writer.write("Word count: " + wordCount);


    }


    private static void backupFiles(String renamedFile, String wordCountFile) {

        try (BufferedWriter backupWriter = new BufferedWriter(new FileWriter("backup.txt"))) {
            try (BufferedReader renamedFileReader = new BufferedReader(new FileReader(renamedFile))) {
                String line;
                while ((line = renamedFileReader.readLine()) != null) {
                    backupWriter.write(line);
                    backupWriter.newLine();

                }

            }
            try (BufferedReader wordCountReader = new BufferedReader(new FileReader(wordCountFile))) {

                String line;

                while ((line = wordCountReader.readLine()) != null) {

                    backupWriter.write(line);

                    backupWriter.newLine();

                }

            }

            System.out.println("Backup content written to 'backup.txt'.");

        } catch (IOException e) {

            System.err.println("Error creating backup: " + e.getMessage());

        }

    }


    private static void deleteFile(String filename) {

        File file = new File(filename);

        if (file.delete()) {
            System.out.println("Deleted " + filename );
        } else {
            System.err.println("Failed to delete " );
        }

    }
    public static void main(String[] args) throws IOException {



//        createFile("javafileOperation.txt");
//
//        renameFile("javafileOperation.txt", "NEW NAME.txt");
//
//
//        int wordCount = countWordsInFile("NEW NAME.txt");
//        writeWordCountToFile("wordcount.txt", wordCount);
//
//        backupFiles("NEW NAME.txt", "wordcount.txt");
//
//        deleteFile("javafileOperation.txt");
//
//        deleteFile("wordcount.txt");
//
//        System.out.println("finish");

    }



}

 