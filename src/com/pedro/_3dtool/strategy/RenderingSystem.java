package com.pedro._3dtool.strategy;

import com.pedro._3dtool.documentstructure.WorldObject;

public class RenderingSystem {
	
	private WorldObjectRenderer renderer;
	
	
	public void render(WorldObject worldObject){
		renderer.render(worldObject);
	}
	

	public void setWorldObjectRenderer(WorldObjectRenderer renderer){
		this.renderer = renderer;
	}
	
}
