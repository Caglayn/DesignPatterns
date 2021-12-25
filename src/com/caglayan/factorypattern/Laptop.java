package com.caglayan.factorypattern;

public class Laptop implements Computable {

	@Override
	public int getRAMSize() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public int getCPUSpeed() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public int getDiskSize() {
		// TODO Auto-generated method stub
		return 800;
	}

}
