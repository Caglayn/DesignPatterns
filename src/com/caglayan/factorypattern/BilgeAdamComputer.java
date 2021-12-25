package com.caglayan.factorypattern;

import java.util.Scanner;

public class BilgeAdamComputer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen gerek duyduğunuz RAM boyutunu giriniz : ");
		int ramSize = scanner.nextInt();
		scanner.nextLine();
		
		Computable computer = ComputerFactory.createComputer(ramSize);
		System.out.println(computer.getCPUSpeed());
		
		scanner.close();
	}

}
