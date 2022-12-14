package APPLE.iPhone;

public class IPhone8 extends BaseIphone {

    @Override
    public void unLock() {
        System.out.println("Unlocking using TouchID or FaceID");
        setLocked(false);
    }
}
