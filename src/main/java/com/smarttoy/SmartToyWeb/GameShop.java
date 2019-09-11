package com.smarttoy.SmartToyWeb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class GameShop {
    	static List<Game> games = new ArrayList<Game>();
    	static List<Game> cart = new ArrayList<Game>();
    	Game g = GameFactory.getInstance().getToy("Nintendo");
    	public GameShop() {
//		games.add(g);
    	}
    	
    	public List<Game> getAllToys(){
    		games.add(g);
    		return games;
    	}
    	
    	public Game getById(int item){
    		return games.get(item);
    	}
    	
    	public List<Game> buyToy(int item){
    		cart.add(this.getById(item));
			return cart;
    	};
    	public List<Game> viewCart(){
    		return cart;
    	}
}
