package ru.javabegin.training.fastjava.objects;

public class Phone {
	
	private int ram;
	private int camera;
	private String name;
	private String type;
	private String processor;
	
	public Phone() {
	}
	
	public Phone(int ram, int camera, String name, String type, String processor) {
		this.ram = ram;
		this.camera = camera;
		this.name = name;
		this.type = type;
		this.processor = processor;
	}
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getCamera() {
		return camera;
	}
	public void setCamera(int camera) {
		this.camera = camera;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
}
