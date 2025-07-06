package ru.javabegin.training.fastjava.objects;

public class Door {
	
	private boolean doorOpen = false;
	private String yes = "Yes!";
	private String no = "No!";

	public String getDoorOpen() {
		
		if (doorOpen == true) {
			return yes;
		} else {
			return no;
		}
	}

	public void setDoorOpen(boolean doorOpen) {
		this.doorOpen = doorOpen;
	}
}
