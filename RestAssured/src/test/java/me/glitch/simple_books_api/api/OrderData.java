package me.glitch.simple_books_api.api;
public class OrderData {
    private boolean created;
    private String orderId;

    public boolean isCreated() {
        return created;
    }

    public String getOrderId() {
        return orderId;
    }

    public OrderData(boolean created, String orderId) {
        this.created = created;
        this.orderId = orderId;
    }
}
