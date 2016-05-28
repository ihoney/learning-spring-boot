package com.example.repository;

import com.example.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by floodliu on 16/5/29.
 */
public interface TeamRepository extends JpaRepository<Team, String> {
}
