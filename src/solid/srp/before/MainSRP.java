package solid.srp.before;

public class MainSRP {
    public static void main(String[] args) {
        User user = new User("Alice", "alice@example.com");
        user.printUser();
        user.saveUser();
    }
}