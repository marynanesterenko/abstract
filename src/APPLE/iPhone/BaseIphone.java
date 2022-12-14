package APPLE.iPhone;

import APPLE.Charger;
import APPLE.Locker;
import APPLE.Messenger;

public abstract class BaseIphone implements Charger, Locker, Messenger {
    private int batteryLevel;
    private String messageText;
    private boolean isLocked;

    public BaseIphone() {
        this.batteryLevel = 60;
        this.messageText = "Welcome!";
        this.isLocked = false;
    }
    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getMessageText(String messageText) {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String isLocked() {
        if (!isLocked) {
            return "Your phone is unlocked";
        } else
            return "Your phone is locked";
    }
    public void setLocked(boolean locked) {
        isLocked = locked;
    }
    @Override
    public void chargeBattery() {
        batteryLevel++;
    }

    @Override
    public void sendMessage(String text) {
        messageText = text;
    }

    @Override
    public void readMessage() {
        System.out.println("Your last message is: " +messageText);
    }

    @Override
    public void lock() {
        System.out.println("Locked");
        setLocked(true);
    }

    @Override
    public void unlock() {
        System.out.println("Unlocked");
        setLocked(false);

    }
}
