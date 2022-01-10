package com.example.restintro.config;

import com.example.restintro.entity.Player;
import com.example.restintro.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class SetupPlayers implements CommandLineRunner {

    final
    PlayerRepository playerRepository;

    public SetupPlayers(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<String> players =    new ArrayList<String>(Arrays.asList(
                "Lionel Messi",
                "Cristiano Ronaldo",
                "Xavi	Midfielder",
                "Andres Iniesta",
                "Zlatan Ibrahimovic",
                "Radamel Falcao",
                "Robin van Persie",
                "Andrea Pirlo",
                "Yaya Toure",
                "Edinson Cavani",
                "Sergio Aguero",
                "Iker Casillas",
                "Neymar",
                "Sergio Busquets",
                "Xabi Alonso",
                "Thiago Silva",
                "Mesut Ozil",
                "David Silva",
                "Bastian Schweinsteiger",
                "Gianluigi Buffon"));
        List<Player> playerEntities = players.stream().map(p->new Player(p)).collect(Collectors.toList());

        playerRepository.saveAll(playerEntities);    }
}
