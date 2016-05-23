package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hongtao on 16/5/23.
 */
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
