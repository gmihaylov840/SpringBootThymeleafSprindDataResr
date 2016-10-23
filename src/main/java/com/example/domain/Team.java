package com.example.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Team {
	
	@Id
	@GeneratedValue
	Long id;
	
	String name;
	String masscot;
	String loacation;
	
	@OneToMany(cascade=CascadeType.ALL) @JoinColumn(name="teamId")
	Set<Player> players;

	public Team() {
	}

	public Team(String loacation, String name, Set<Player> players) {
		this.loacation = loacation;
		this.name = name;
		this.players = players;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMasscot() {
		return masscot;
	}

	public void setMasscot(String masscot) {
		this.masscot = masscot;
	}

	public String getLoacation() {
		return loacation;
	}

	public void setLoacation(String loacation) {
		this.loacation = loacation;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

}