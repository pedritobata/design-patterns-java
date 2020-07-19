package com.pedro._3dtool.documentstructure;

public class Client {

	public static void main(String[] args) {
		
		// Simulamos la creacion de un disenho 3d de una casa en un piso o terreno o un root
		
		ComposedWorldObject root = new ComposedWorldObject("Root");
		ComposedWorldObject house = new ComposedWorldObject("House");
		
		// Creamos figuras geometricas
		Circle circle = new Circle("Circle");
		Square square = new Square("Square");
		
		Circle circle2 = new Circle("Circle2");
		Square square2 = new Square("Square2");
		
		
		// usamos las figuras para armar estructuras 
		// podemos combinarlas como queramos gracias al patron COMPOSITE!!!
		//TODOS los elementos son del mismo tipo WorldObject
		
		root.getWorldObjects().add(house);
		house.getWorldObjects().add(circle);
		house.getWorldObjects().add(square);
		
		root.getWorldObjects().add(circle2);
		root.getWorldObjects().add(square2);
		
		
		// pintamos todo 
		
		root.print();
		

	}

}
