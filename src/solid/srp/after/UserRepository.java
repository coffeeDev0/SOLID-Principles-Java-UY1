package solid.srp.after;

public class UserRepository {
    public void saveUser(User user) {
        System.out.println("Saving user " + user.getName() + " to database");
    }
}
