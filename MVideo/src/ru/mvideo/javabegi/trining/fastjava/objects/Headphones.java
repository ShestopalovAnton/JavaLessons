package ru.mvideo.javabegi.trining.fastjava.objects;

public class Headphones {
	
	private String brand;
	private String model;
	private String color;
	private boolean microphone;
	private int sensitivity;
	private int weight;
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

	public boolean isMicrophone() {
		return microphone;
	}
	public void setMicrophone(boolean microphone) {
		this.microphone = microphone;
	}

	public int getSensitivity() {
		return sensitivity;
	}
	public void setSensitivity(int sensitivity) {
		this.sensitivity = sensitivity;
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

	public void takeHeadphones(int take) {
		
		if (take > quantity) {
			
			 System.out.println("Товара недостаточно на складе! Вы можете взять не больше " + quantity + " штук(и)");
					
		} else {
			
			quantity = quantity - take;
			System.out.println("Вы взяли " + take + " штук(и)");
			
		}
	}
}
