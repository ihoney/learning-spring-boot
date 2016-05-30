package com.example.repository;

import com.example.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by floodliu on 16/5/31.
 */
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
