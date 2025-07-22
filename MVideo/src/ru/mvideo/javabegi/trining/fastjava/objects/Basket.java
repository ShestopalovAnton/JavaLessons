package ru.mvideo.javabegi.trining.fastjava.objects;

public class Basket {
	
	private String brand;
	private String model;
	private int price;
	private int quantity;
	private int count = 4; 
	
	
	
	public Basket(String brand, String model, int price, int quantity) {
		
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	private static Basket[] basket = new Basket[4];
	
	public static int getProducts(int idProduct) {
		System.out.println(basket[idProduct].brand + " " + basket[idProduct].model + " " + basket[idProduct].price + " " + basket[idProduct].quantity);
		return 1;
	}
	
	public void setProduct(String brand, String model, int price, int quantity) {
		
		if (count > 0) {
		
			Basket.basket[count].brand = brand;
			Basket.basket[count].model = model;
			Basket.basket[count].price = price;
			Basket.basket[count].quantity = quantity;

			count = count - 1;
			
		} else {
			System.out.println("Корзина переполнена!");
			return;
		}
	}
}