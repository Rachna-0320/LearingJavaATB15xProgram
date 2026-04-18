package ex_16_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab0144_Exception_Throws {
    public static void main(String[] args) {

    }

    static void t() throws FileNotFoundException{
        FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}



