package org.parkerInc.springApp;
import java.util.List;
public class AudiImpl implements ICar{
	private int id;
	private String color;
	private Engine engine;
	private List<String> addons;
	public AudiImpl() {
		System.out.println("Audi implementation object created");
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
		sb.append("Audi car details \ncar ID: "+getId()+"\ncar color: "+getColor()+"\ncar engine: "+getEngine()+
				"\ncar addons: "+getAddons()+"\ndriving Audi");
		System.out.println(sb);
	}
}
