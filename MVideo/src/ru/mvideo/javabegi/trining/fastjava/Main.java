package ru.mvideo.javabegi.trining.fastjava;

import ru.mvideo.javabegi.trining.fastjava.objects.Cashier;

public class Main {

	public static void main(String[] args) {
		System.out.println("Начало дня!");
		
		Cashier cashier_1 = new Cashier();
		
		cashier_1.setName("Мария Петровна");
		cashier_1.setExperience("3 года");
		
		System.out.println("Кассир " + cashier_1.getName() + " стаж - " + cashier_1.getExperience());
		System.out.println("Денег у кассира: " + cashier_1.getMoney());
		
		//cashier_1.sellProduct(5000);
		System.out.println("Номер чека: " + cashier_1.sellProduct(5000));
	}
}
