package me.glitch.simple_books_api.api;

public class OrderStatus {
    private String id;
    private int bookId;
    private String customerName;
    private String createdBy;
    private int quantity;
    private long timestamp;

    public OrderStatus(String id, int bookId, String customerName, String createdBy, int quantity, long timestamp) {
        this.id = id;
        this.bookId = bookId;
        this.customerName = customerName;
        this.createdBy = createdBy;
        this.quantity = quantity;
        this.timestamp = timestamp;
    }
    public String getId() {
        return id;
    }

    public int getBookId() {
        return bookId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
