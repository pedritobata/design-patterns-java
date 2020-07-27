package com.pedro._3dtool.strategy;

import com.pedro._3dtool.documentstructure.ComposedWorldObject;


public class Client {
	
	
	
	public static void main(String[] args){
		ComposedWorldObject root = new ComposedWorldObject("root");
		
		RenderingSystem renderingSystem = new RenderingSystem();
		WorldObjectRenderer quickRenderer = new QuickRenderer();
		WorldObjectRenderer finalImageRenderer = new DetailedRenderer();
		
		renderingSystem.setWorldObjectRenderer(quickRenderer);
		renderingSystem.render(root);
		
		renderingSystem.setWorldObjectRenderer(finalImageRenderer);
		renderingSystem.render(root);
		
	}

}
