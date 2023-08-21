package DTO;

public class User {

    String username;
    String password;
    String email;
    int superCoins;

    public User(){}

    public User(String username, String password, String email, int superCoins){
        this.username = username;
        this.password = password;
        this.email = email;
        this.superCoins = superCoins;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setSuperCoins(int superCoins){
        this.superCoins = superCoins;
    }

    public int getSuperCoins(){
        return this.superCoins;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", superCoins=" + superCoins +
                '}';
    }
}
