package com.pedro.designpatterns.creational.factory;

public class Client {
	
	public static void main(String... args) {
		
		TransportFactory factory = new BikeFactory();
		Transport transport = factory.create();
		transport.drive();
		
		factory = new CarFactory();
		transport = factory.create();
		transport.drive();
		
	}

}
