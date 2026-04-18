package ex_16_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab0143_Exception_FileReader {
    public static void main(String[] args) {

        System.out.println("Starting");

        try{
            FileReader f = new FileReader  ("C://abc.txt"); // "C://abc.txt" this is not present in Mac
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Ending");
    }
}
