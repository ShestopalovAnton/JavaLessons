package ru.mvideo.javabegi.trining.fastjava.objects;

public class GameConsole {
	
	private String model;
	private String color;
	private boolean bluetooth;
	private boolean wifi;
	private int hdd;
	private int weight;
	private int price;
	private int quantity;
		
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}
	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public int getHdd() {
		return hdd;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void takeGameConsole(int take) {
		
		if (take > quantity) {
			
			 System.out.println("Товара недостаточно на складе! Вы можете взять не больше " + quantity + " штук(и)");
					
		} else {
			
			quantity = quantity - take;
			System.out.println("Вы взяли " + take + " штук(и)");
			
		}
	}
}
