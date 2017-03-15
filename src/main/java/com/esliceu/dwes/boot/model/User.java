package com.esliceu.dwes.boot.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class User implements Serializable {

    public User(){

    }

    public User(String name, String surname, String username, String hour, String type) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.hour = hour;
        this.type = type;
    }

    @Id
    @Column(name = "id_user")
    private int id;

    @Column( name = "name")
    private String name;

    @Column( name = "surname")
    private String surname;

    @Column(name = "username")
    private String username;

    @Column( name = "hour")
    private String hour;

    @Column( name = "type")
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
