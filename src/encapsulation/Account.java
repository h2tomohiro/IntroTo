package encapsulation;

public class Account {
    String username;
    String password;

    Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    boolean login(String username, String password) {
        if (!username.equals(this.username)){
            System.out.println("Invalid username.");
            return false;
        }
        if (!password.equals(this.username)){
            System.out.println("Invalid username.");
            return false;
        }
        System.out.println("invalid credentials.");
        return false;
        }
}
