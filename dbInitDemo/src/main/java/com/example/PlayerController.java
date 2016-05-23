package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by hongtao on 16/5/23.
 */
@RestController
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @RequestMapping(value = "/player/{id}", method = RequestMethod.GET)
    public Player addPlayer(@PathVariable("id") Long id) {
        return playerRepository.findOne(id);
    }

    @RequestMapping(value = "/player", method = RequestMethod.GET)
    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }
}
