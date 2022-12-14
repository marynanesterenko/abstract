package APPLE.iPhone;

public class IPhone7 extends BaseIphone {
    @Override
    public void unLock() {
        System.out.println("Unlocking using TouchID");
        setLocked(false);
    }
}
