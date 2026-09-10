class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}

class BankAccount{
    int accountNumber;
    private double balance = 2000;
    double amaount;

    void Withdraw(double amount){
        try{
        if(amount>balance){
            throw new InsufficientBalanceException("insufficent Balance");
        }else{
            balance = balance - amount;
            System.out.println("Remaning balance : "+balance);
        }
    }catch(InsufficientBalanceException e){
        System.out.println(e);
    }
}
}

public class Mainbankingsystem{
    public static void main(String[] args) {
        BankAccount ac = new BankAccount();
        ac.Withdraw(1000);
    }
}
