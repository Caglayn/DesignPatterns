package com.caglayan.factorypattern;

public class Server implements Computable {

	@Override
	public int getRAMSize() {
		// TODO Auto-generated method stub
		return 128;
	}

	@Override
	public int getCPUSpeed() {
		// TODO Auto-generated method stub
		return 4000;
	}

	@Override
	public int getDiskSize() {
		// TODO Auto-generated method stub
		return 1_000_000;
	}
	
}
