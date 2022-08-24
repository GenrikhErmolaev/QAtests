package me.glitch.simple_books_api.api;

public class BooksData {
    private Integer id;
    private String name;

    private String type;

    private boolean available;


    public BooksData(int id, String name, String type, boolean available) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.available = available;
    }
}
