package com.caglayan.factorypattern;

import java.util.Scanner;

public class PetShop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen istediğiniz hayvanı yazın : ");
		String animalType = scanner.nextLine();
		
		Animal animal = AnimalFactory.create(animalType);
		animal.giveVoice();
		
		if(!animal.isPet())
			System.out.println("Aslan ev hayvanı değildir.");
		
		scanner.close();

	}

}
