package com.SOA.demo.SoaUser;

import jakarta.persistence.*;

@Entity
@Table
public class SoaUser {
    @Id
    @SequenceGenerator(
            name = "SoaUser_sequence",
            sequenceName = "SoaUser_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SoaUser_sequence"
    )
    private long id;
    private String name;
    private String email;

    public SoaUser() {
    }

    public SoaUser(String name, String email) {
        this.name = name;
        this.email = email;
    }



    public SoaUser(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
