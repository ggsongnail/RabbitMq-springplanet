package org.song.message;

import java.io.Serializable;

public class AppleMessage implements Serializable{
	private String color;
	private int weight;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
