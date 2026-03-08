package ex_04_Increment_Decrement_Operators;

public class Lab029_If_Else_Condition_CLI {
    public static void main(String[] args) {

        int age =Integer.parseInt(args[0]) ;

        if (age > 18) {
            System.out.println("You can vote");
        }else {
            System.out.println("You can't vote");
        }

//        int age1 =Integer.parseInt(args[1]) ;
//        if (age1 > 24){
//            System.out.println("You can go to Goa");
//        }else{
//            System.out.println("You can't go to Goa");
//        }


    }

}
