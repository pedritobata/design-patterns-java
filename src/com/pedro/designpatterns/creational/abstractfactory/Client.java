package com.pedro.designpatterns.creational.abstractfactory;

public class Client {
	
	
	public static void initializeGUI(WidgetFactory widgetFactory) {
		initializeGUI(widgetFactory.createScrollbar(), widgetFactory.createWindow());
	}
	
	
	
	public static void initializeGUI(Scrollbar scrollbar, Window window) {
		System.out.println("Initializing GUI with " + scrollbar.getClass().getSimpleName() + 
				 " and " + window.getClass().getSimpleName()); 
	}
	
	
	
	
	
	public static void main(String... args) {
		
		WidgetFactory factory = new YellowThemeWidgetFactory();
		
		initializeGUI(factory);
		
		factory = new PinkThemeWIdgetFactory();
		initializeGUI(factory);
		
	}

}
