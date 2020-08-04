package com.pedro.designpatterns.creational.factory;

public class CarFactory extends TransportFactory{

	@Override
	public Transport create() {
		
		return new Car();
	}

}
