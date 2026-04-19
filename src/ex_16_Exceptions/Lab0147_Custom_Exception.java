package ex_16_Exceptions;

public class Lab0147_Custom_Exception {
    public static void main(String[] args)  throws CurrencyMisMatchCustomException {

        Bank sbi = new Bank("INR", 100);
        Bank icici = new Bank("INR", 123);

        int total = sbi.add(icici);
        System.out.println("Total INR: " + total);

        Bank jp_chase = new Bank("USD", 101);
        int total_new = sbi.add(jp_chase);
        System.out.println(total_new);
    }
}

class Bank {
    private String currency;
    private int amount;

    public Bank(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }
    public int getAmount() {
        return amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int add(Bank bankName) throws CurrencyMisMatchCustomException {
        if (bankName.currency.equals("INR")) {
            return bankName.amount + this.amount;
        }else{
            throw new CurrencyMisMatchCustomException ("Currency MisMatch!");
        }
    }
}

class CurrencyMisMatchCustomException extends Exception{
    public CurrencyMisMatchCustomException (String msg){
        super (msg);
    }
}