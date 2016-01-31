package org.hillel.lesson15;

/**
 * Created by yuriy on 25.01.16.
 */
public class User {
    public static void main(String[] args) {
//        ATM atm = new ATM();
//        try {
//            atm.getMoney(1500);
//        } catch (InsufficientMoney e) {
//            e.printStackTrace();
//        }

        try (ATM atm = new ATM()) {
            atm.getMoney(1500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
