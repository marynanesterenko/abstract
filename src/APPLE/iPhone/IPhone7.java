package APPLE.iPhone;

public class IPhone7 extends BaseIphone {
    IPhone7(int batteryLevel, String messageText, boolean isLocked) {
        super(batteryLevel, messageText, isLocked);
    }

    @Override
    public void lock() {
        System.out.println("Locking... using touchID");
    }

    @Override
    public void unLock() {
        System.out.println("unLocking... using touchID");
    }
}
