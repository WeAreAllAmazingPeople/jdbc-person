package com.switchfully.jdbcperson;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String favoriteColor;

    public Person(int id, String firstName, String lastName, String favoriteColor) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.favoriteColor = favoriteColor;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }
}
