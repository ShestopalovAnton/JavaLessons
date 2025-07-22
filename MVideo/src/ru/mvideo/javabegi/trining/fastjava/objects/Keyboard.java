package ru.mvideo.javabegi.trining.fastjava.objects;

public class Keyboard {
	
	private String model;
	private String color;
	private String connectionType;
	private String typeOfKeys;
	private int keyboardFormat;
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

	public String getConnectionType() {
		return connectionType;
	}
	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public String getTypeOfKeys() {
		return typeOfKeys;
	}
	public void setTypeOfKeys(String typeOfKeys) {
		this.typeOfKeys = typeOfKeys;
	}

	public int getKeyboardFormat() {
		return keyboardFormat;
	}
	public void setKeyboardFormat(int keyboardFormat) {
		this.keyboardFormat = keyboardFormat;
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

	public void takeKeyboard(int take) {
		
		if (take > quantity) {
			
			 System.out.println("Товара недостаточно на складе! Вы можете взять не больше " + quantity + " штук(и)");
					
		} else {
			
			quantity = quantity - take;
			System.out.println("Вы взяли " + take + " штук(и)");
			
		}
	}
}
