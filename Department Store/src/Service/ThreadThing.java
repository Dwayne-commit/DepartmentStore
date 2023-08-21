package Service;

import java.util.Scanner;

public class ThreadThing extends Thread {

    UserService ser = new UserService();
    StoreInformation storeInformation = new StoreInformation();

    public void run() {
        int t = ser.loginAuth();
        if (t == 2) {
            int y = 0;
            while (y != 3) {
                System.out.println("ENTER AN OPTION");
                System.out.println("1. VIEW ITEMS");
                System.out.println("2. SORT PRICE");
                System.out.println("3. SORT CATEGORY");
                System.out.println("4. EXIT");
                Scanner scann = new Scanner(System.in);
                int ts = scann.nextInt();
                switch (ts) {
                    case 1:
                        storeInformation.printItem();
                        break;
                    case 2:
                        storeInformation.filterByPrice();
                        break;
                    case 3:
                        storeInformation.filterByCategory();
                        break;
                    case 4:
                        System.out.println("EXIT");
                        y = 3;
                        break;
                }
            }
        }
    }
}
