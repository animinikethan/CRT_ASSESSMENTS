package CRT;

class Bank {
    double amount;

    Bank(double amount) {
        this.amount = amount;
    }

    void withdrawalAmount(double money) {
        if (money <= amount) {
            amount -= money;
            System.out.println("Withdrawal successful");
            System.out.println("Balance after withdrawal: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void depositAmount(double cash) {
        amount += cash;
        System.out.println("Deposit successful");
        System.out.println("Total balance: " + amount);
    }
}

public class BankAmount {
    public static void main(String[] args) {
        Bank b = new Bank(10000);
        b.withdrawalAmount(2000);
        b.depositAmount(5000);
    }
}