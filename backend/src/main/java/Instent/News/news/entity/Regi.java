package Instent.News.news.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Regi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String mobileNumber;

    private String email;

    private String password;

    public Regi() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword()
    {

        if (password == null) {
            return null;
        }

        StringBuilder original = new StringBuilder();

        for (int i = 0; i < password.length(); i++) {
            original.append((char)(password.charAt(i) - 3));
        }

        return original.toString();
    }
    // Encrypt password before storing in MySQL
    public void setPassword(String password) {

        if (password == null) {
            this.password = null;
            return;
        }

        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            encrypted.append((char) (ch + 3));
        }

        this.password = encrypted.toString();
    }
}