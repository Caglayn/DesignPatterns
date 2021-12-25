package com.caglayan.factorypattern;

public class ComputerFactory {
	public static Computable createComputer(int ramSize) {
		if(ramSize < 30) {
			return new Laptop();
		}
		
		if(ramSize < 120) {
			return new PC();
		}
		
		return new Server();
	}
}
