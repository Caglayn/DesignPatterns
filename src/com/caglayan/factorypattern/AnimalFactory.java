package com.caglayan.factorypattern;

public class AnimalFactory {

	public static Animal create(String animalType) {
		if(animalType.equalsIgnoreCase("köpek")) {
			return new Dog();
		}
		
		if(animalType.equalsIgnoreCase("kus")) {
			return new Bird();
		}
		
		return new Lion();
	}
}
