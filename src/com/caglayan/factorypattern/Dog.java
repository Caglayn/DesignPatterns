package com.caglayan.factorypattern;

public class Dog extends Animal{

	public Dog() {
		super(4, true, "Dog");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void giveVoice() {
		System.out.println("Havhav..");
		
	}

}
