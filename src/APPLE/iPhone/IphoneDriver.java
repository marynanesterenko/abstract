package APPLE.iPhone;

import java.util.Scanner;

public class IphoneDriver extends BaseIphone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BaseIphone b;

        int askAgain = 0;

        System.out.println("Which Iphone do you want to choose?(Iphone7, IPhone8, Iphone10):");
        int choice = sc.nextInt();

        switch (choice) {
            case 7 -> b = new IPhone7();
            case 8 -> b = new IPhone8();
            case 10 -> b = new Iphone10();
            default -> {
                System.out.println("Please select the model from given options only!");
                b = null;
            }
        }

        do {
            System.out.println("Which function do you want to access:\n" +
                    "        1. Check BatteryLife\n" +
                    "        2. Charge Iphone\n" +
                    "        3. SendMessage\n" +
                    "        4. ReadLastMessage\n" +
                    "        5. check if iphone is locked\n" +
                    "        6. lock iphone\n" +
                    "        7. unlock iphone");

            int function = sc.nextInt();
            switch (function) {
                case 1 -> {
                    assert b != null;
                    System.out.println("Your battery is at: " + b.getBatteryLevel() + "%");
                }
                case 2 -> {
                    assert b != null;
                    b.chargeBattery();
                    System.out.println("Your battery is at: " + b.getBatteryLevel() + "%");
                }
                case 3 -> {
                    System.out.println("Please enter your message: ");
                    String message = sc.next();
                    assert b != null;
                    b.sendMessage(message);
                }
                case 4 -> {
                    assert b != null;
                    b.readMessage();
                }
                case 5 -> {
                    assert b != null;
                    System.out.println(b.isLocked());
                }
                case 6 -> {
                    assert b != null;
                    b.lock();
                }
                case 7 -> {
                    assert b != null;
                    b.unlock();
                }
                default -> System.out.println("Please select the functions from given options only!");
            }
            System.out.println("Enter 1 to run again" + "\n" + "or 2 to stop: ");

            askAgain = sc.nextInt();
        } while (askAgain == 1);
    }

    @Override
    public void unLock() {

    }
}
