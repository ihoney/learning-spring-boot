package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by floodliu on 16/5/28.
 */
@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;

    private Integer number;
    private String team;

    protected Player() {
    }

    public Player(String firstName, String lastName, Integer number, String team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.team = team;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
