package dethi;

public class Bank {
    double balance;
    double rate;


    public Bank() {

    }

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double CalculateInterest() {
        return balance * (rate / 1200);

    }

    @Override
    public String toString() {
        return "Bank{" +
                "balance=" + balance +
                ", rate=" + rate +
                '}';
    }
}
