package ru.mvideo.javabegi.trining.fastjava.objects;

public class Phone {
	
	private String brand;
	private String model;
	private String color;
	private String processor;
	private int rom;
	private int camera;
	private int price;
	private int quantity;

	public String getMBrand() {
		return brand;
	}
	public void setMBrand(String brand) {
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
	
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public int getRom() {
		return rom;
	}
	public void setRom(int ram) {
		this.rom = ram;
	}
	
	public int getCamera() {
		return camera;
	}
	public void setCamera(int camera) {
		this.camera = camera;
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
	
	public void takePhone(int take) {
		
		if (take > quantity) {
			
			 System.out.println("Товара недостаточно на складе! Вы можете взять не больше " + quantity + " штук(и)");
					
		} else {
			
			quantity = quantity - take;
			System.out.println("Вы взяли " + take + " штук(и)");
			
		}
	}
}
