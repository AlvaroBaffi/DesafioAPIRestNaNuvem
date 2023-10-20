package me.dio.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="tb_rank")
public class Rank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int level;
	
	private String elo;
	
	private int numberOfMatches;
	
	private int numberOfVictories;
	
	private int numberOfDefeats;
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getElo() {
		return elo;
	}
	public void setElo(String elo) {
		this.elo = elo;
	}
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public int getNumberOfVictories() {
		return numberOfVictories;
	}
	public void setNumberOfVictories(int numberOfVictories) {
		this.numberOfVictories = numberOfVictories;
	}
	public int getNumberOfDefeats() {
		return numberOfDefeats;
	}
	public void setNumberOfDefeats(int numberOfDefeats) {
		this.numberOfDefeats = numberOfDefeats;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
