package com.example.controller;

import com.example.configuration.TeamEditor;
import com.example.entity.Player;
import com.example.entity.Team;
import com.example.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by floodliu on 16/5/29.
 */
@RestController
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @RequestMapping(value = "/player", method = RequestMethod.GET)
    public List<Player> getPlayersByTeam(@RequestParam(value = "team") Team team) {
        return playerRepository.getPlayersByTeam(team);
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Team.class, new TeamEditor());
    }
}
