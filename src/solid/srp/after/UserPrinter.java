package solid.srp.after;

public class UserPrinter {
    public void printUser(User user) {
        System.out.println("User: " + user.getName() + ", Email: " + user.getEmail());
    }
}