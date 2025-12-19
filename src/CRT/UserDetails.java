package CRT;

class Login {
    private String username;
    private String password;

    Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    String getUsername() {
        return username;
    }

    boolean isPasswordValid() {
        return password.length() >= 8;
    }

    String getPassword() {
        return password;
    }
}

public class UserDetails {
    public static void main(String[] args) {
        Login l = new Login("Kethan", "1220058520");

        System.out.println("Username is: " + l.getUsername());

        if (l.isPasswordValid()) {
            System.out.println("Password is created");
            System.out.println("Password is: " + l.getPassword());
        } else {
            System.out.println("Password should be at least 8 characters");
        }
    }
}
