package org.hillel.lesson15;

/**
 * Created by yuriy on 25.01.16.
 */
public class InsufficientMoney extends Exception {
    int shotrtage;

    public int getShotrtage() {
        return shotrtage;
    }

    public void setShotrtage(int shotrtage) {
        this.shotrtage = shotrtage;
    }

    public InsufficientMoney(String message) {
        super(message);
    }

    public InsufficientMoney(String message, Throwable cause) {
        super(message, cause);
    }
}
