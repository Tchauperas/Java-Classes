package entities;

public class Rented {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Rented(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
