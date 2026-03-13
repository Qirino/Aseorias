package Easy;
public class BankAccount{
    private int balance;

    public BankAccount(int balance){
        if(balance > 0) this.balance = balance;
        else this.balance = 0;
    }

    public boolean deposit(int amount){
        if(amount > 0){
            balance += amount;
            return true;
        }
        return false;
    }
    public boolean withdrow(int amount){
        if(amount > 0 && amount < balance){
            balance -= amount;
            return true;
        }
        return false;
    }
    public int getBalance(){
        return this.balance;
    }
}