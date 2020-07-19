package com.pedro._3dtool.documentstructure;

public class Square extends WorldObject{
	
	public Square(String specification) {
		this.specification = specification;
	}

	@Override
	public void print() {
		System.out.println(specification);
		
	}

	@Override
	public String getName() {
		
		return specification;
	}

}
