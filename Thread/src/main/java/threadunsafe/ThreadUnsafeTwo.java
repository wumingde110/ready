package threadunsafe;

import lombok.Data;

public class ThreadUnsafeTwo {
    @Data
    static class Account {
        private int money;
        private String name;
    }

    static class test implements Runnable {
        private Account account;
        private int getMoney;

        public test(Account account, int getMoney) {
            this.account = account;
            this.getMoney = getMoney;
        }

        @Override
        public void run() {
            synchronized (account) {
                if (account.getMoney() >= getMoney) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    account.setMoney(account.getMoney() - getMoney);
                    System.out.println(Thread.currentThread().getName() + " " + account.getMoney());
                } else {
                    System.out.println(Thread.currentThread().getName() + " no");
                }
            }

        }
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.setName("acc");
        account.setMoney(100);
        test t = new test(account, 50);
        test t1 = new test(account, 100);
        Thread thread = new Thread(t, "one");
        Thread thread1 = new Thread(t1, "two");
        thread.start();
        thread1.start();
    }
}
