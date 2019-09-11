package com.smarttoy.SmartToyWeb;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import main.SpringBootApp;

@SpringBootApplication
@RestController
public class App {
	private GameShop gameshop = new GameShop();
//	private Cart cart = new Cart();

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

	}

	@RequestMapping("/gameshop")
	public List<Game> getAllToys() {
		return gameshop.getAllToys();
	}

	@RequestMapping("/")
	String Firstpage() {

		return "THIS IS MY Game SHOP !!";
	}

	@RequestMapping(value = "/gameshop/{id}")
	Game viewToy(@PathVariable int id) {
		return gameshop.getById(id);
	}

	@RequestMapping(value = "/gameshop/{id}/buy")
	List<Game> buyToy(@PathVariable int id) {
		return gameshop.buyToy(id);
	}

	@RequestMapping(value = "/cart")
	public List<Game> viewCart() {
		return gameshop.viewCart();
	}

	@RequestMapping(value = "/payment")
	public String payCart() {
		gameshop.viewCart().clear();

		return "THANK YOU FOR BUY ITEM";
	}

}
