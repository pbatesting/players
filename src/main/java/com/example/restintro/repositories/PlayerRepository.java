package com.example.restintro.repositories;

import com.example.restintro.entity.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player,Integer> {
}
