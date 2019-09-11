package com.smarttoy.SmartToyWeb;

public class GameFactory {
	private static GameFactory game = new GameFactory();
	private GameFactory(){}
	   public static GameFactory getInstance(){
		      return game;
		   }
	 public static Game getToy(String gameType){
	 if(gameType == null){
	 return null;
	 }
	 if(gameType.equalsIgnoreCase("Nintendo")){
	 return new Nintendo("POKEMON GEN 8", 6578, "ADVENTURE", 10);
	 } else if(gameType.equalsIgnoreCase("Sega")){
	 return new Sega("BLEACH", 3000, "ACTION", 20);
	 }
	 return null;
	 }
	}
