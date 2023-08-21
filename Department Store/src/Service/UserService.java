package Service;

import DAO.UserDAO;
import DTO.User;

import java.util.*;


public class UserService {
    private Scanner sc;
    UserDAO userdao;

    List<User> usli;

    public UserService() {
        usli = new ArrayList<User>();
        sc = new Scanner(System.in);
        userdao = new UserDAO();
    }

    public List<User> insert() {
        User user = new User("princy1", "1234", "princy1@gmail.com", 100);
        User user1 = new User("londonpark", "8890", "londonpark@yahoo.com", 100);
        User[] userr = {user, user1};
        usli = Arrays.asList(userr);
        userdao.insertUser(usli);
        return usli;
    }


    public List<User> register() {
        User user = new User("princy1", "1234", "princy1@gmail.com", 100);
        User user1 = new User("londonpark", "8890", "londonpark@yahoo.com", 100);
        System.out.println("WOULD YOU LIKE TO REGISTER AN ACCOUNT");
        System.out.println("1. YES");
        System.out.println("2. NO");
        int cho = sc.nextInt();
        if (cho == 1) {
            System.out.println("ENTER THE USERNAME");
            String usenam = sc.nextLine();
            sc.nextLine();
            System.out.println("ENTER THE E-MAIL");
            String ema = sc.nextLine();
            System.out.println("ENTER THE PASSWORD");
            String passwrd = sc.nextLine();
            User user2 = new User(usenam, passwrd, ema, 100);
            User[] userr = {user, user1, user2};
            usli = Arrays.asList(userr);
            userdao.insertUser(usli);
            insert().add((User) usli);
            System.out.println("WELCOME TO THE DEPARTMENT STORE");
            user2.toString();
        }
        return usli;
    }

    public void show(){
        userdao.display();
    }

    public int loginAuth(){
        int val = 0;
            System.out.println("ENTER USERNAME");
            String username = sc.nextLine();
            System.out.println("ENTER PASSWORD");
            String password = sc.nextLine();
            if (userdao.search(username, password, insert())[0] == true) {
                System.out.println("WELCOME PRINCY");
                val = 1;
                return val;
            } else if (userdao.search(username, password, insert())[1] == true) {
                System.out.println("WELCOME TO THE DEPARTMENT STORE");
                val = 2;
                return val;
            }
        return val;
    }
}

