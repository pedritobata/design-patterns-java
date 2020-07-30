package com.pedro.designpatterns.creational.builder;

public class SqlQuery implements Query{
	
	private String from;
	private String where;

	@Override
	public void execute() {
		System.out.println("Executing query from SQL..." + "from Table " 
				+ from + ", where " + where);
		
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}
	
	

}
