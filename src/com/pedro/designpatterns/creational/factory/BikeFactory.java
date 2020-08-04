package com.pedro.designpatterns.creational.factory;

public class BikeFactory extends TransportFactory{

	@Override
	public Transport create() {
		
		return new Bike();
	}

}
