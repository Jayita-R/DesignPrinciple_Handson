package com.jayita.designpattern.AdpterPattern;

public class MovableAdapterImpl implements MovableAdapter {
	private Movable luxuryCars;
	// standard constructors
	MovableAdapterImpl(Movable luxuryCars){
		super();
		this.luxuryCars=luxuryCars;
	}
	

	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}
	private double convertMPHtoKMPH(double mph) { 
		return mph * 1.60934; 
		}


	@Override
	public double getPrice() {
		return convertUSDtoEURO(luxuryCars.getPrice());
	}
	private double convertUSDtoEURO(double usd) { 
		return usd * 0.84; 
		}

}
