package com.pedro.designpatterns.creational.builder;

public class Client {
	
	public static void main(String... args) {
		
		QueryBuildDirector director = new QueryBuildDirector();
		
		SqlQuery sql = (SqlQuery)director.buildQuery("UsersSQL","name = sql", new SqlQueryBuilder());
		sql.execute();
		
		MongoDBQuery mongo = (MongoDBQuery)director.buildQuery("UsersMongo", "name = mongo", new MongoDBQueryBuilder());
		mongo.execute();
		
	}

}
