package com.pedro.designpatterns.creational.abstractfactory;

public class PinkThemeWIdgetFactory implements WidgetFactory{

	@Override
	public Scrollbar createScrollbar() {
		
		return new PinkThemeScrollbar();
	}

	@Override
	public Window createWindow() {
		
		return new PinkThemeWindow();
	}

}
