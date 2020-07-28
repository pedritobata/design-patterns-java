package com.pedro.designpatterns.creational.singleton;

/*
 * Esta clase es un Singleton
 */
public class Preferences {
	
	private static Preferences preferences;
	
	protected Preferences(){
		
	}
	
	
	private synchronized static void createInstance(){
		if(preferences == null) preferences = new Preferences();
	}
	
	
	public static Preferences getInstance(){
		if(preferences == null) createInstance();
		return preferences;
	}
	
	public void printPreferences(){
		System.out.println("Printing preferences with Singleton " + preferences);
	}

}
