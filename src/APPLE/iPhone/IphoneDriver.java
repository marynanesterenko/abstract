package APPLE.iPhone;

import java.util.Scanner;

public class IphoneDriver {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int askAgain = 0;
        do {
            System.out.println("Please choose an iPhone model, your options are: 7, 8, or 10");
            int model = userInput.nextInt();

            BaseIphone b;

            switch (model) {
                case 7:
                    b = new IPhone7(60, "Welcome", false);
                    break;

                case 8:
                    b = new IPhone8(60, "Welcome", false);
                    break;

                case 10:
                    b = new IPhone10(60, "Welcome", false);
                    break;
                default:
                    System.out.println("Please select the model from given options only!");
            }

            System.out.println("Please select which action you would like to perform? Select from the following: " +
                    "1. Check BatteryLife\n" +
                    "2. Charge Iphone\n" +
                    "3. SendMessage\n" +
                    "4. ReadLastMessage\n" +
                    "5. check if iphone is locked\n" +
                    "6. lock iphone\n" +
                    "7. unlock iphone");


            int action = userInput.nextInt();
            switch (action) {
                case 1:
                    b.getBatteryLevel(); // we cannot figure this out -> BUT Baiat is working on it :)
                    break;

                case 2:
                    b.chargeBattery();
                    break;

                case 3:
                    System.out.println("Please enter your message: ");
                    String message = userInput.nextLine();
                    b.sendMessage(message);
                    break;

                case 4:
                    b.readMessage();
                    break;

                case 5:
                    b.isLocked();
                    break;

                case 6:
                    b.lock();
                    break;

                case 7:
                    b.unLock();
                    break;

                default:
                    System.out.println("Please select the model from given options only!");
            }

            System.out.println("Enter 1 to run again" + "\n" + "or 2 to stop: ");
            askAgain = userInput.nextInt();
        } while (askAgain == 1);
    }
}
