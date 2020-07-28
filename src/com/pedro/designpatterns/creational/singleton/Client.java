package com.pedro.designpatterns.creational.singleton;

public class Client {
	
	public static void main(String... args){
		
		Preferences singleton1 = Preferences.getInstance();
		singleton1.printPreferences();
		
		Preferences singleton2 = Preferences.getInstance();
		singleton2.printPreferences();
		
		//Obteniendo el Singleton a traves de un hijo de Preferences
		Preferences singletonChild = MyPreferences.getInstance();
		singletonChild.printPreferences();
		
		
	}

}
