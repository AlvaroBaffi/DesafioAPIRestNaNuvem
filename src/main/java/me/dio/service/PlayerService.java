package me.dio.service;

import me.dio.domain.model.Player;

public interface PlayerService {
	Player findById(Long id);
	
	Player create(Player playerToCreate);
	
	void delete(Long id);
}
