package com.example.restintro.api;

import com.example.restintro.entity.Player;
import com.example.restintro.repositories.PlayerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @GetMapping
    ResponseEntity<Iterable<Player>> getPlayers(){

        return ResponseEntity.status(HttpStatus.OK).body(playerRepository.findAll());
    }



}
