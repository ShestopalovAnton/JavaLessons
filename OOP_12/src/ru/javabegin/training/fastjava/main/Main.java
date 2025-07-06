package ru.javabegin.training.fastjava.main;

import ru.javabegin.training.fastjava.objects.Car;
import ru.javabegin.training.fastjava.objects.Door;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		Door door = new Door();
		
		car.setName("Toyota");
		door.setDoorOpen(false);
		
		System.out.println("Car name: " + car.getName());
		System.out.println("Door is open " + door.getDoorOpen());
	}
}

