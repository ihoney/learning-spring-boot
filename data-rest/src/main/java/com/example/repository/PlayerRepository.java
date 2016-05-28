package com.example.repository;

import com.example.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by floodliu on 16/5/28.
 */
@RepositoryRestResource
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
