package com.pedro.designpatterns.creational.abstractfactory;

public interface WidgetFactory {
	
	Scrollbar createScrollbar();
	
	Window createWindow();

}
