package com.smarttoy.SmartToyWeb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ToyShop {
    	static List<Toy> toys = new ArrayList<Toy>();
    	static List<Toy> cart = new ArrayList<Toy>();
    	
    	public ToyShop() {
		toys.add(new Toy("A01", "ROBOT", 5000));
		toys.add(new Toy("A02", "DOLLS", 500));
		toys.add(new Toy("A03", "GAMEBOYS", 10000));
    	}
    	
    	public List<Toy> getAllToys(){
    		return toys;
    	}
    	
    	public Toy getById(int item){
    		return toys.get(item);
    	}
    	
    	public List<Toy> buyToy(int item){
    		cart.add(this.getById(item));
			return cart;
    	};
    	public List<Toy> viewCart(){
    		return cart;
    	}
}
