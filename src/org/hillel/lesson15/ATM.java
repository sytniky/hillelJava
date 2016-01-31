package org.hillel.lesson15;

/**
 * Created by yuriy on 25.01.16.
 */
public class ATM implements AutoCloseable {
    int totalaSum;

    public ATM() {
        this.totalaSum = 1000;
    }

    public void getMoney(int money) throws InsufficientMoney {
        if (money > totalaSum) {
            throw new InsufficientMoney("Not enought money");
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("ATM is closed");
    }
}
