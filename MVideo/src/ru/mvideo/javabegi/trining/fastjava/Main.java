package ru.mvideo.javabegi.trining.fastjava;

import ru.mvideo.javabegi.trining.fastjava.objects.Phone;
import ru.mvideo.javabegi.trining.fastjava.objects.Basket;
import ru.mvideo.javabegi.trining.fastjava.objects.Cashier;

public class Main {

	public static void main(String[] args) {
		System.out.println("Начало дня!");
		
		Cashier cashier_1 = new Cashier();
		
		cashier_1.setName("Мария Петровна");
		cashier_1.setExperience("3 года");
		cashier_1.setMoney(10000);
		
		System.out.println("Кассир " + cashier_1.getName() + " стаж - " + cashier_1.getExperience());
		System.out.println("Денег у кассира: " + cashier_1.getMoney());
		
		//cashier_1.sellProduct(5000);
		System.out.println("Номер чека: " + cashier_1.sellProduct(5000));
		
		Phone phone1 = new Phone();
		
		phone1.setMBrand("iPhone");
		phone1.setModel("16 Pro Max");
		phone1.setColor("Black");
		phone1.setProcessor("A18 Pro");
		phone1.setRom(256);
		phone1.setCamera(48);
		phone1.setQuantity(10);
		
		System.out.println("\nХарактеристики: ");
		System.out.println("Бренд - " + phone1.getMBrand());
		System.out.println("Модель - " + phone1.getModel());
		System.out.println("Цвет - " + phone1.getColor());
		System.out.println("Процессор - " + phone1.getProcessor());
		System.out.println("Память - " + phone1.getRom());
		System.out.println("Камера - " + phone1.getCamera() + "\n");
		
		phone1.takePhone(2);
		
		Basket basket = new Basket("Null", "Null", 12, 1);
		
		Basket.getProducts(1);
		
		
	}
}
