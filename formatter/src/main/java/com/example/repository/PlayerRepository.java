package com.example.repository;

import com.example.entity.Team;
import com.example.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by floodliu on 16/5/29.
 */
public interface PlayerRepository extends JpaRepository<Player, Long> {

    List<Player> findByTeam(Team team);
}
