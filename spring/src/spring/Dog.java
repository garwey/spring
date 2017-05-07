package spring;

import java.util.Date;

public class Dog {
	private String name;
	private float weight;

	public Dog() {
		name = "default_dog";
	}

	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public float getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

}
