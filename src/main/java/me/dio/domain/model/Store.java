package me.dio.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="tb_store")
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int blueEssences;
	
	private int orangeEssences;
	
	private int riotPoints;
	
	public int getBlueEssences() {
		return blueEssences;
	}
	public void setBlueEssences(int blueEssences) {
		this.blueEssences = blueEssences;
	}
	public int getOrangeEssences() {
		return orangeEssences;
	}
	public void setOrangeEssences(int orangeEssences) {
		this.orangeEssences = orangeEssences;
	}
	public int getRiotPoints() {
		return riotPoints;
	}
	public void setRiotPoints(int riotPoints) {
		this.riotPoints = riotPoints;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
