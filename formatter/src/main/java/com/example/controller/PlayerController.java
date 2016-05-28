package com.example.controller;

import com.example.entity.Team;
import com.example.entity.Player;
import com.example.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by floodliu on 16/5/29.
 */
@RestController
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @RequestMapping(value = "/player", method = RequestMethod.GET)
    public List<Player> getPlayer(@RequestParam(value = "team") Team team) {
        return playerRepository.findByTeam(team);
    }
}
