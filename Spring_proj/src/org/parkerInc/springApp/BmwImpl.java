package org.parkerInc.springApp;

import java.util.List;

public class BmwImpl implements ICar{
	private int id;
	private String color;
	private Engine engine;
	private List<String> addons;
	public BmwImpl() {
		System.out.println("Bmw implementation object created");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public List<String> getAddons() {
		return addons;
	}
	public void setAddons(List<String> addons) {
		this.addons = addons;
	}
	@Override
	public void drive() {
		StringBuilder sb=new StringBuilder();
		sb.append("Bmw car details \ncar ID: "+getId()+"\ncar color: "+getColor()+"\ncar engine: "+getEngine()+
				"\ncar addons: "+getAddons()+"\ndriving Bmw");
		System.out.println(sb);
	}

}
