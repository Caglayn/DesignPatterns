package com.caglayan.factorypattern;

public abstract class Animal {
	private  int numberOfLegs;
	private boolean pet;
	private String type;
	
	
	public Animal(int numberOfLegs, boolean pet, String type) {
		this.numberOfLegs = numberOfLegs;
		this.pet = pet;
		this.type = type;
	}



	public abstract void giveVoice();



	public int getNumberOfLegs() {
		return numberOfLegs;
	}


	public boolean isPet() {
		return pet;
	}


	public String getType() {
		return type;
	}
	
	
}
