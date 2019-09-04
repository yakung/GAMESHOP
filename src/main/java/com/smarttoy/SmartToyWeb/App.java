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
	private ToyShop toyshop = new ToyShop();
//	private Cart cart = new Cart();
	
    public static void main(String[] args) {    	
        SpringApplication.run(App.class, args);
    }
    
	@RequestMapping("/toyshop")    
	public List<Toy> getAllToys() {
	    return toyshop.getAllToys();
	}
	
    @RequestMapping("/")
    String Firstpage() {
        return "THIS IS MY TOY SHOP !!";
    }
    @RequestMapping(value = "/toyshop/{id}")
    Toy viewToy(@PathVariable int id) {
        return toyshop.getById(id);
    }
    @RequestMapping(value = "/toyshop/{id}/buy")
    List<Toy> buyToy(@PathVariable int id) {
        return toyshop.buyToy(id);
    }
    
    @RequestMapping(value = "/cart")
    public List<Toy> viewCart() {
        return toyshop.viewCart();
    }
    @RequestMapping(value = "/payment")
    public String payCart() {
    	toyshop.viewCart().clear();
    	
        return "THANK YOU FOR BUY ITEM";
    }
    
    
    
       
}
