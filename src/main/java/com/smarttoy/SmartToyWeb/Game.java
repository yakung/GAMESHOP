package com.smarttoy.SmartToyWeb;

public abstract class Game {
//	private String id;
//	private String name;
//	private int price;
//	private String desc;
//
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//
//	public String getDesc() {
//		return desc;
//	}
//
//	public void setDesc(String desc) {
//		this.desc = desc;
//	}
//
//	public Game(String id, String name, int price) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.price = price;
//	}
//
//	public Game(String name, int price, String desc) {
//		this.name = name;
//		this.price = price;
//		this.desc = desc;
//	}
	public abstract String getName();
	public abstract int getPrice();
	public abstract String getDesc();
	public abstract int getAmount();
	
	@Override
	public String toString(){
		return "Name= "+this.getName()+", Price="+this.getPrice()+", Desc="+this.getDesc();
	}
	

}
