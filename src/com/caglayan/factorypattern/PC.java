package com.caglayan.factorypattern;

public class PC implements Computable{

	@Override
	public int getRAMSize() {
		// TODO Auto-generated method stub
		return 32;
	}

	@Override
	public int getCPUSpeed() {
		// TODO Auto-generated method stub
		return 2500;
	}

	@Override
	public int getDiskSize() {
		// TODO Auto-generated method stub
		return 1000;
	}

}
