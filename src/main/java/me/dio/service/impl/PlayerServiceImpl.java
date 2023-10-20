package me.dio.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.domain.model.Player;
import me.dio.domain.repository.PlayerRepository;
import me.dio.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService{

	private final PlayerRepository playerRepository;
	
	public PlayerServiceImpl(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}
	
	@Override
	public Player findById(Long id) {
		return playerRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public Player create(Player playerToCreate) {	
		if(playerToCreate.getId() != null && playerRepository.existsById(playerToCreate.getId())) {
			throw new IllegalArgumentException("This player ID already exists");
		}
		return playerRepository.save(playerToCreate);
	}

	@Override
	public void delete(Long id) {
		playerRepository.deleteById(id);		
	}
	
}
