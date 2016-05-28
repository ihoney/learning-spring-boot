package com.example.entity;

import javax.persistence.*;

/**
 * Created by floodliu on 16/5/29.
 */
@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Long number;

    @ManyToOne
    private Team team;

    protected Player() {
    }

    public Player(String name, Long number, Team team) {
        this.name = name;
        this.number = number;
        this.team = team;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
