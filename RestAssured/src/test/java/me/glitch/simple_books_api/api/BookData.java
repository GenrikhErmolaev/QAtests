package me.glitch.simple_books_api.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BookData {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("current-stock")
    @Expose
    private Integer currentStock;
    @SerializedName("available")
    @Expose
    private Boolean available;

    public BookData(Integer id, String name, String author, String type, Double price, Integer currentStock, Boolean available) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.type = type;
        this.price = price;
        this.currentStock = currentStock;
        this.available = available;
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getCurrentStock() {
        return currentStock;
    }

    public Boolean getAvailable() {
        return available;
    }
}
