package me.glitch.simple_books_api.test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import me.glitch.simple_books_api.api.*;
import org.junit.jupiter.api.*;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static me.glitch.simple_books_api.utils.Settings.*;


public class TestBase {
    private static String accessToken = null;
    private  static String orderIDNumber;

    @Test
    @DisplayName("Server status checking -> 200")
    void checkServerStatus() {
        RestAssured.baseURI = baseUrl + "status";
        RequestSpecification httpRequest = given();
        Response response = httpRequest.get("");
        int statusCode = response.getStatusCode();
        Assertions.assertEquals(200, statusCode);
    }

    @Test
    @DisplayName("Receiving accessToken confirmation -> notNull")
    public  void bearerTokenObtainingConformation() {
        UserRegistrationRespond httpRequest = given()
                .contentType(ContentType.JSON)
                .body(newUser)
                .when()
                .post(baseUrl + "api-clients")
                .then()
                .extract().body().as(UserRegistrationRespond.class);
        accessToken = httpRequest.getToken();
        Assertions.assertNotNull(httpRequest.getToken());
    }


    @Nested
    @DisplayName("Order placing")
    public class OrderPlacing {




        @Test
        @DisplayName("Receiving books list")
        void getListOfBooks() {
            List<BooksData> books = given()
                    .contentType(ContentType.JSON)
                    .when()
                    .get(baseUrl + "books")
                    .then()
                    .extract().body().jsonPath().getList("", BooksData.class);
            Assertions.assertEquals(6, books.size());

        }

        @Test
        @DisplayName("New user registration confirmation -> 409 respond")
            // Status code 409 - "API client already registered."
        void checkNewUserRegistration() {
            RestAssured.baseURI = baseUrl + "api-clients";
            RequestSpecification httpRequest = given();

            Response response = httpRequest.contentType(JSON)
                    .body(newUser).post();
            int statusCode = response.getStatusCode();
            Assertions.assertEquals(409, statusCode);
        }

        @Test
        @DisplayName("Book id#3 availability")
        void checkBookAvailability() {
            BookData book = given()
                    .contentType(JSON)
                    .when()
                    .get(baseUrl + "books/3")
                    .then()
                    .extract().body().as(BookData.class);
            Assertions.assertTrue(book.getAvailable());
        }

        @Test
        @DisplayName("Creating a new order")
        public void orderPlacing() {
            OrderData httpRequest = given()
                    .header("Authorization", "Bearer " + accessToken)
                    .contentType(ContentType.JSON)
                    .body(newOrder)
                    .when()
                    .post(baseUrl + "orders")
                    .then()
                    .extract().body().as(OrderData.class);
            orderIDNumber = httpRequest.getOrderId();
            Assertions.assertTrue(httpRequest.isCreated());
        }

        @Test
        @DisplayName("Confirmation successful order creation")
        void orderInformation() {
            List<OrderStatus> order = given()
                    .header("Authorization", "Bearer " + accessToken)
                    .contentType(JSON)
                    .when()
                    .get(baseUrl + "orders/")
                    .then()
                    .extract().body().jsonPath().getList("", OrderStatus.class);
            Assertions.assertNotNull(order.get(order.size() - 1).getId());
        }

        @Test
        @DisplayName("Order update")
        void orderUpdate() {
            Response httpRequest = given()
                    .header("Authorization", "Bearer " + accessToken)
                    .contentType(ContentType.JSON)
                    .body(orderUpdate)
                    .when()
                    .patch(baseUrl + "orders/" + orderIDNumber);
            List<OrderStatus> orderAfterUpdate = given()
                    .header("Authorization", "Bearer " + accessToken)
                    .contentType(JSON)
                    .when()
                    .get(baseUrl + "orders/")
                    .then()
                    .extract().body().jsonPath().getList("", OrderStatus.class);
            Assertions.assertEquals("Василий", orderAfterUpdate.get(orderAfterUpdate.size() - 1).getCustomerName());
        }
    }

    @AfterAll
    public static void orderDelete() {
        Response httpRequest = given()
                .header("Authorization", "Bearer " + accessToken)
                .contentType(ContentType.JSON)
                .when()
                .delete(baseUrl + "orders/" + orderIDNumber);
        List<OrderStatus> orderAfterUpdate = given()
                .header("Authorization", "Bearer " + accessToken)
                .contentType(JSON)
                .when()
                .get(baseUrl + "orders/")
                .then()
                .extract().body().jsonPath().getList("", OrderStatus.class);
        Assertions.assertEquals(0, orderAfterUpdate.size());
        System.out.println("Order deleted");
    }
}
