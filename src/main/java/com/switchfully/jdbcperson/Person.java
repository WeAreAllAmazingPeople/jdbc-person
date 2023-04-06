package com.switchfully.jdbcperson;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    @Id
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "favorite_color")
    private String favoriteColor;

    @OneToOne
    @JoinColumn(name = "fk_address_id")
    private Address address;

    public Person(int id, String firstName, String lastName, String favoriteColor) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.favoriteColor = favoriteColor;
    }

    protected Person() {

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

    public Address getAddress() {
        return address;
    }
}
