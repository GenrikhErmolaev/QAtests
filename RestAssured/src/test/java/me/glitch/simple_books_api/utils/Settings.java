package me.glitch.simple_books_api.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class Settings {
    public static String baseUrl = "https://simple-books-api.glitch.me/";
    public static String generatedString = RandomStringUtils.random(5, true, false);
    public static String newUser = "{\"clientName\": \"Sergei\", \"clientEmail\": \"test" + generatedString + "@testt2.tt\"}";
    public static String newOrder = "{\"bookId\": \"3\", \"customerName\": \"Сергей\"}";
    public static String orderUpdate = "{\"customerName\": \"Василий\"}";


}