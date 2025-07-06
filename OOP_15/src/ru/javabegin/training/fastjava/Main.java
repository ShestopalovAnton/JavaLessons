package ru.javabegin.training.fastjava;

import ru.javabegin.training.fastjava.objects.Phone;

public class Main {

	public static void main(String[] args) {
		
		Phone phone = new Phone(1024, 108, "Samsung", "GSM", "Snapdragon 6 gen1");
		
		System.out.println("phone.getRam() = " + phone.getRam());
		System.out.println("phone.getCamera() = " + phone.getCamera());
		System.out.println("phone.getNamee() = " + phone.getName());
		System.out.println("phone.getType() = " + phone.getType());
		System.out.println("phone.getProcessor() = " + phone.getProcessor());
		
		phone.setName("LG");
	}

}
