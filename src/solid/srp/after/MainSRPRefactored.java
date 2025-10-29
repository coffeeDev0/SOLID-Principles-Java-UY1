package solid.srp.after;

public class MainSRPRefactored {
    public static void main(String[] args) {
        User user = new User("Alice", "alice@example.com");
        UserPrinter printer = new UserPrinter();
        UserRepository repository = new UserRepository();

        printer.printUser(user);
        repository.saveUser(user);
    }
}
