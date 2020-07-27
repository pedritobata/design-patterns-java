package com.pedro._3dtool.strategy;

import com.pedro._3dtool.documentstructure.WorldObject;

public class QuickRenderer implements WorldObjectRenderer{

	@Override
	public void render(WorldObject worldObject) {
		System.out.println("QuickRenderer executing rendering process...");
		
	}

}
