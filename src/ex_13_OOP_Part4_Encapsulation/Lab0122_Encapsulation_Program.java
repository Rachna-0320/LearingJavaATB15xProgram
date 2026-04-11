package ex_13_OOP_Part4_Encapsulation;

public class Lab0122_Encapsulation_Program {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount("Riya", 1000);
        System.out.println("Account Holder: " + ba.getAccountHolderName());
        System.out.println("Balance: " + ba.getBalance());
        ba.setBalance(2000, false);
        System.out.println("Updated Balance: " + ba.getBalance());
    }
}
class BankAccount{
    private String accountHolderName;
    private int balance;

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance, boolean isCashier){
        if(isCashier) {
            this.balance = balance;
        } else {
            System.out.println("Not allowed to modify the balance");
        }
    }
    BankAccount(String accountHolderName, int balance){
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
}