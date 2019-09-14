package com.smarttoy.SmartToyWeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameShopService {
	private static GameShopService game = new GameShopService();
	private GameShopService(){}
	   public static GameShopService getInstance(){
	        if (game == null) {
	            game = new GameShopService();
	        }
	        return game;
		   }

	@Autowired
	private GameRepository gameRepository;
	
	public List<Game> getAllGame(){
			return gameRepository.findAll();
	}

	public void addGame(Game game){
		gameRepository.save(game);
	}

	public void deleteGame(String id) {
		gameRepository.deleteById(id);
	}
}
