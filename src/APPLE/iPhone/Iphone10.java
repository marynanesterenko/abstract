package APPLE.iPhone;

public class Iphone10 extends BaseIphone{
    IPhone10(int batteryLevel, String messageText, boolean isLocked) {
        super(batteryLevel, messageText, isLocked);
    }

    @Override
    public void unLock() {
        System.out.println("unLocking... using faceID");
    }
}
