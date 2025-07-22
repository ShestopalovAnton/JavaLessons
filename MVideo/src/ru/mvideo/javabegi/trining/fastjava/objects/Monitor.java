package ru.mvideo.javabegi.trining.fastjava.objects;

public class Monitor {
	
	private String brand;
	private String model;
	private String color;
	private int screenResolution;
	private int screenDiagonal;
	private int screenFrequency;
	private int price;
	private int quantity;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

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

	public int getScreenResolution() {
		return screenResolution;
	}
	public void setScreenResolution(int screenResolution) {
		this.screenResolution = screenResolution;
	}

	public int getScreenDiagonal() {
		return screenDiagonal;
	}
	public void setScreenDiagonal(int screenDiagonal) {
		this.screenDiagonal = screenDiagonal;
	}

	public int getScreenFrequency() {
		return screenFrequency;
	}
	public void setScreenFrequency(int screenFrequency) {
		this.screenFrequency = screenFrequency;
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
	
	public void takeMonitor(int take) {
		
		if (take > quantity) {
			
			 System.out.println("Товара недостаточно на складе! Вы можете взять не больше " + quantity + " штук(и)");
					
		} else {
			
			quantity = quantity - take;
			System.out.println("Вы взяли " + take + " штук(и)");
			
		}
	}
}
