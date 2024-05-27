package io.smartir.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountWithoutAsync {
    private static Account account = new Account();

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            executor.execute(new AddAPennyTask());
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        System.out.println("What is balance? " + account.getBalance());
    }

    private static class AddAPennyTask implements Runnable {

        @Override
        public void run() {
            account.deposit(1);
        }
    }

}
