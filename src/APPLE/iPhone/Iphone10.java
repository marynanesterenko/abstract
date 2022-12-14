package APPLE.iPhone;

public class Iphone10 extends BaseIphone{

    @Override
    public void unLock() {
        System.out.println("Unlocking using FaceID");
        setLocked(false);
    }
}
