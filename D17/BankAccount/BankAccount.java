public class BankAccount implements Runnable {
    private int balance = 0;
    public int getBalance() {
        return balance;
    }

    public synchronized void deposit(int money) {
        balance = balance + money;
    }

    public synchronized int retrieve(int money) {
        int result = 0;
        if (balance > money) {
            result = money;
        } else {
            result = balance;
        }
        balance = balance - result;
        return result;
    }

    public static void main(String args[]) {
        BankAccount account = new BankAccount();
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(account);
            t.start();
        }
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            deposit(20);
            retrieve(10);
        }
        System.out.println("Balance: " + getBalance());
    }
}