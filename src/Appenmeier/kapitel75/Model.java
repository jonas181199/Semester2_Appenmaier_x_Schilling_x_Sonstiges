package Appenmeier.kapitel75;

public class Model {

    private User user;
    private static Model instance;

    private Model (){
    }

    public static Model getInstance(){
        if (instance == null){
            instance = new Model();
        }
        return instance;
    }

    public void setUser(String userName, String password) {
        user = new User(userName, password);
    }

    public String getUserName() {
        return user.getUserName();
    }
}
