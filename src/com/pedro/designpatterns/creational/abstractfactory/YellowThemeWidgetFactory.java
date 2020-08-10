package com.pedro.designpatterns.creational.abstractfactory;

public class YellowThemeWidgetFactory implements WidgetFactory{

	@Override
	public Scrollbar createScrollbar() {
		
		return new YellowThemeScrollbar();
	}

	@Override
	public Window createWindow() {
		
		return new YellowThemeWindow();
	}

}
