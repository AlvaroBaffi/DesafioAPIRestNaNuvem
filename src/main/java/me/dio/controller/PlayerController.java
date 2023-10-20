package me.dio.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import me.dio.domain.model.Player;
import me.dio.service.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {

	private final PlayerService playerService;
	
	public PlayerController(PlayerService playerService) {
		this.playerService = playerService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Player> findById(@PathVariable Long id){
		var player = playerService.findById(id);
		return ResponseEntity.ok(player);
	}
	
	@PostMapping
	public ResponseEntity<Player> create(@RequestBody Player playerToCreate){
		var playerCreated = playerService.create(playerToCreate);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(playerCreated.getId())
				.toUri();
		return ResponseEntity.created(location).body(playerToCreate);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id){
		playerService.delete(id);		
	}
}
