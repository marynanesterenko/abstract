package APPLE.iPhone;

public class Iphone8 extends BaseIphone {
    IPhone8(int batteryLevel, String messageText, boolean isLocked) {
        super(batteryLevel, messageText, isLocked);
    }

    @Override
    public void lock() {
        System.out.println("Locking... using touchID OR faceID");
    }

    @Override
    public void unLock() {
        System.out.println("unLocking... using touchID OR faceID");
    }
}
