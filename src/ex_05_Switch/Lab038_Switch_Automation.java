package ex_05_Switch;

import java.util.Scanner;

public class Lab038_Switch_Automation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Browser");
        String browser = sc.next();

        browser = browser.toLowerCase();   //This line converts the value stored in the
        // browser string to lowercase using the toLowerCase() method and assigns the converted
        // value back to the same variable. This is done to make input comparison case-insensitive.
        // -> toLowerCase() → converts all letters to small letters
        // -> User input → CHROME
        //            ↓
        //toLowerCase()
        //            ↓
        //chrome
        //            ↓
        //switch matches case "chrome"

        switch (browser){
            case "chrome" :
                System.out.println("Starting the chrome");
                break;
            case "firefox" :
                System.out.println("Starting the firefox");
                break;
            case "edge" :
                System.out.println("Execute the edge code");
                break;
            default:
                System.out.println("I have bo idea which browser is this");
                break;
        }

    }
}
