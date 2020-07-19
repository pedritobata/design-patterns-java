package com.pedro._3dtool.documentstructure;

import java.util.ArrayList;
import java.util.List;

public class ComposedWorldObject extends WorldObject{
	
	private List<WorldObject> worldObjects;
	
	
	public ComposedWorldObject(String specification) {
		this.specification = specification;
		this.worldObjects = new ArrayList<>();
	}
	
	

	@Override
	public void print() {
		System.out.println(specification);
		
		for(WorldObject item : worldObjects) {
			item.print();
		}
		
	}

	@Override
	public String getName() {
		
		return specification;
	}



	public List<WorldObject> getWorldObjects() {
		return worldObjects;
	}



	public void setWorldObjects(List<WorldObject> worldObjects) {
		this.worldObjects = worldObjects;
	}
	
	

}
