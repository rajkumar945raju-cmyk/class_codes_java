class BankAccount{
    private double balance = 0.0;

    public void withdrawl(int amount){
        balance -= amount;
    }

    public void deposit(int amount){
        balance += amount;
    }
    
    public double getbalance(){
        return balance;
    }
}

public class Mainbank{
    public static void main(String[] args){
        BankAccount ba = new BankAccount();
        ba.deposit(500);
        ba.deposit(100);
        //ba.getbalance();
        System.out.println(ba.getbalance());
    }
    }