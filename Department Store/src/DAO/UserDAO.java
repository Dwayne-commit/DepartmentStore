package DAO;

import DTO.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDAO {

    private List<User> user;
    private Scanner sc;
    public UserDAO(){
        user = new ArrayList<User>();
        sc = new Scanner(System.in);
    }

    public void insertUser(List<User> userr){
        for(int i = 0; i < userr.size(); i++){
            user.add(userr.get(i));
        }
    }

    public boolean[] search(String username, String password, List<User> userr){
        boolean isUser = false;
        boolean isAdmin = false;
        for(int i = 0; i < userr.size(); i++){
            if(userr.get(i).getUsername().compareTo(username) == 0 &&  userr.get(i).getPassword().compareTo(password) == 0 && username.equals("princy1") && password.equals("1234")){
                isAdmin =  true;
                //System.out.println("Admin Login success");
            } else if(userr.get(i).getUsername().compareTo(username) == 0 &&  userr.get(i).getPassword().compareTo(password) == 0 && !username.equals("princy1") && !password.equals("1234")){
                isUser = true;
               // System.out.println("User Login Successful");
            }
        }
        boolean[] val = {isAdmin,isUser};
        return val;
    }

    public void display(){
        user.stream().forEach(useobj -> {
            System.out.println("USERNAME " + useobj.getUsername());
            System.out.println("PASSWORD " + useobj.getPassword());
            System.out.println("E-MAIL " + useobj.getEmail());
            System.out.println("SUPERCOINS " + useobj.getSuperCoins());
        });
    }
}
