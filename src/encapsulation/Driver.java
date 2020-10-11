package encapsulation;

public class Driver {
    public static void main(String[] args) {
        Account acct1 = new Account("abc123", "123");
        acct1.login("abc123", "123");
    }
}
