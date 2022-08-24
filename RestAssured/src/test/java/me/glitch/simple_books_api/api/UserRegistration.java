package me.glitch.simple_books_api.api;


public class UserRegistration {
    private String clientName;
    private String clientEmail;

    public UserRegistration(String clientName, String clientEmail) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
    }
}
