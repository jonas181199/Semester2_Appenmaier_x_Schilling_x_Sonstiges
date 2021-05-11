package Appenmeier.kapitel75;

public class User {

    private String userName;
    private String password;

    public User(String userName, String password){
        this.password = password;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
