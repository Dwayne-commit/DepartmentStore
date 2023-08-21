package Main;

import Service.InvalidInputException;
import Service.StoreInformation;
import Service.ThreadThing;
import Service.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidInputException{

        UserService userService = new UserService();
        StoreInformation storeInformation = new StoreInformation();

        storeInformation.insertItems();
        storeInformation.insertProd();
        storeInformation.insertProducts();
/*
  //     itemService.insert();
  //      itemService.show();
  //      itemService.filt();
  //      itemService.fillet();
      //  itemService.insertt();
       // itemService.showw();
      //  itemService.searchh();
      //  itemService.filtr();
      //  itemService.searchName();

        //userService.insert();
        //userService.show();
        //userService.loginAuth();
        /*
     */
        boolean logged = false;
        while(!logged) {
            System.out.println("ENTER A NUMBER TO CHOOSE AN OPTION");
            System.out.println("1. LOGIN");
            System.out.println("2. CREATE ACCOUNT");
            System.out.println("3. EXIT");
            Scanner sc = new Scanner(System.in);
            int cho = sc.nextInt();
            switch(cho){
                case 1:
                    int vall = userService.loginAuth();
                    if(vall == 1) {
                        int v = 0;
                        while (v != 3) {
                            System.out.println("ENTER A NUMBER TO CHOOSE AN OPTION");
                            System.out.println("1. LIST PRODUCTS IN STORE");
                            System.out.println("2. SEARCH BY PRODUCT ID");
                            System.out.println("3. LIST PRODUCTS BY CATEGORY");
                            System.out.println("4. SEARCH PRODUCT BY NAME");
                            System.out.println("5. CHECK TOTAL");
                            System.out.println("6. DISPLAY PROFIT ON EACH CATEGORY");
                            System.out.println("7. EXIT");
                            Scanner scan = new Scanner(System.in);
                            int ch = scan.nextInt();
                            switch(ch){
                                case 1:
                                    storeInformation.printProduct();
                                    break;
                                case 2:
                                    storeInformation.searchById();
                                    break;
                                case 3:
                                    storeInformation.sortByCategory();
                                    break;
                                case 4:
                                    storeInformation.searchByName();
                                    break;
                                case 5:
                                    System.out.println("TOTAL AMOUNT SPENT: " + "101,900.99");
                                    break;
                                case 6:
                                    System.out.println("GROCERY: " + " 40,700");
                                    System.out.println("TOILETRY: " + " 30,500");
                                    System.out.println("STATIONARY: " + " 9,800");
                                    System.out.println("VEGETABLE: " + "20,900");
                                    break;
                                case 7:
                                    System.out.println("EXIT");
                                    v = 3;
                                    break;
                            }
                        }
                    }
                    if(vall == 2){
                        int y = 0;
                        while(y != 3){
                            System.out.println("ENTER AN OPTION");
                            System.out.println("1. VIEW ITEMS");
                            System.out.println("2. SORT PRICE");
                            System.out.println("3. SORT CATEGORY");
                            System.out.println("4. LOGIN AS DIFFERNT USER");
                            System.out.println("5. EXIT");
                            Scanner scann = new Scanner(System.in);
                            int ts = scann.nextInt();
                            switch(ts){
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
                                    ThreadThing nTh = new ThreadThing();
                                    nTh.start();
                                    break;
                                case 5:
                                    System.out.println("EXIT");
                                    y = 3;
                                    break;
                            }
                        }
                    }
                    if(vall != 1 || vall != 2){
                        throw new InvalidInputException();
                    }
                    break;
                case 2:
                    userService.register();
                    int f = 0;
                    while(f != 7){
                        System.out.println("ENTER AN OPTION");
                        System.out.println("1. VIEW ITEMS");
                        System.out.println("2. SORT PRICE");
                        System.out.println("3. SORT CATEGORY");
                        System.out.println("4. EXIT");
                        Scanner sca = new Scanner(System.in);
                        int ta = sca.nextInt();
                        switch(ta){
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
                                f = 7;
                                break;
                        }
                    }
                    break;
                case 3:
                    System.exit(3);
                    break;
            }
        }
    }
}
