package io.smartir.multithread;

public class Account {
    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount) {
        int newBalance = balance + amount;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("here");
        }
        balance = newBalance;
    }
}
