package ex_19_Collection_Framework_LIST;

import java.util.*;
import java.util.Scanner;

public class Lab0168_LinkedList_UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String continueInput = "Yes";
        List<String> names = new LinkedList<>();

        while(continueInput.equalsIgnoreCase("Yes")){

            System.out.println("Enter the name you want to store:");
            String name = scanner.nextLine();
            names.add(name);

            System.out.println("Do you want to add another name? (yes/no):");
            continueInput = scanner.nextLine();
        }

        System.out.println("Stored Names:");

        for (String name: names){
            System.out.println(name);
        }
        scanner.close();
    }
}
