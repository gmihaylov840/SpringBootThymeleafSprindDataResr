package com.example;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.TeamDao;
import com.example.domain.Player;
import com.example.domain.Team;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired TeamDao teamDao;
	
	@PostConstruct
	public void init() {
		Set<Player> players = new HashSet<>();

		players.add(new Player("Player 1", "The Player"));
		players.add(new Player("Player 2", "Second best player"));

		Team team = new Team("Sweet home Alabama", "The A Team", players);
		
		teamDao.save(team);
	}
}
