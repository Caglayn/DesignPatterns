package com.caglayan.factorypattern;

public class Bird extends Animal {

	public Bird() {
		super(2, true, "Kanarya");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void giveVoice() {
		System.out.println("Cikcik");
	}

}
