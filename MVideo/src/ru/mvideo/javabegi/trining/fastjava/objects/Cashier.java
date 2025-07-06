package ru.mvideo.javabegi.trining.fastjava.objects;

public class Cashier {
	
	private String name;
	private String experience;
	private int money = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int sellProduct(int money) {
		this.money = this.money + money;
		int productReceipt = (int)(Math.random() * this.money) / 10;
		return productReceipt;
	}
	
}
