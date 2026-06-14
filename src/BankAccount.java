import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private final Lock lock = new ReentrantLock();

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void unsafeWithdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public void withdraw(double amount) {

        lock.lock();

        try {
            if (balance >= amount) {

                System.out.println(Thread.currentThread().getName()
                        + " withdrawing $" + amount);

                balance -= amount;

                System.out.println("Remaining: $" + balance);

            } else {
                System.out.println("Insufficient funds!");
            }

        } finally {
            lock.unlock();
        }
    }

    public double getBalance() {
        return balance;
    }
}
