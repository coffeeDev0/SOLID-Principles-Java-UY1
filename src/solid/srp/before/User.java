package solid.srp.before;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void printUser() {
        System.out.println("User: " + name + ", Email: " + email);
    }

    public void saveUser() {
        System.out.println("Saving user " + name + " to database");
    }
}
