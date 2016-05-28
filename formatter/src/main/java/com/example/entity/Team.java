package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by floodliu on 16/5/29.
 */
@Entity
@Table(name = "teams")
public class Team {

    @Id
    private String name;

    protected Team() {
    }

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
