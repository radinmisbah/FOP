package com.company;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        insertdata("HAHAHHAHAHHA");
        try {
            Scanner inputStream = new Scanner(new
                    FileInputStream("test.txt"));

            while (inputStream.hasNextLine()){
                String data = inputStream.nextLine();
                System.out.println(data);

            }


            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }


    }

    public static void insertdata(String x){
        try {
            PrintWriter outputStream = new PrintWriter(new
                    FileOutputStream("test.txt",true));

            outputStream.println(x);

            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

    }
}
