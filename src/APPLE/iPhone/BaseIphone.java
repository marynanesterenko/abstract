package APPLE.iPhone;

import APPLE.Charger;
import APPLE.Locker;
import APPLE.Messenger;

public abstract class BaseIphone implements Charger, Locker, Messenger {
    private int batteryLevel;
    private String messageText;
    private boolean isLocked;


    BaseIphone(int batteryLevel, String messageText, boolean isLocked) {
        this.batteryLevel = batteryLevel;
        this.messageText = messageText;
        this.isLocked = false;

    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public boolean isLocked() {
        return isLocked;
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
        System.out.println(messageText);
    }

    @Override
    public void lock() {
        System.out.println("Locked");
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}
