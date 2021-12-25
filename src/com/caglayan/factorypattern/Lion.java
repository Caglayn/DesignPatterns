package com.caglayan.factorypattern;

public class Lion extends Animal {

	public Lion() {
		super(4, false, "Lion");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void giveVoice() {
		System.out.println("Waaaov");
	}

}
