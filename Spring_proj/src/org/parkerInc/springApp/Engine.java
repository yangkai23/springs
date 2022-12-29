package org.parkerInc.springApp;
public class Engine {
private int engine_id;
private int engine_power;
private String engine_type;
public String getEngine_type() {
	return engine_type;
}
public void setEngine_type(String engine_type) {
	this.engine_type = engine_type;
}
public int getEngine_id() {
	return engine_id;
}
public void setEngine_id(int engine_id) {
	this.engine_id = engine_id;
}
public int getEngine_power() {
	return engine_power;
}
public void setEngine_power(int engine_power) {
	this.engine_power = engine_power;
}
@Override
	public String toString() {
		StringBuffer s=new StringBuffer();
		s.append("\n Engine details: \n Engine ID: "+getEngine_id()+"\n Engine Power: "+getEngine_power()+"HP \n Engine Type: "+getEngine_type()+"\n");
		return s.toString();
	}

}
