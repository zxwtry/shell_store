package com.wiley.beginningspring.ch4;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) throws SQLException {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Ch4Configuration.class);
		DataSource dataSource = applicationContext.getBean("dataSource", DataSource.class);
		
		Connection connection = dataSource.getConnection();
		System.out.println(connection.isClosed());
		connection.close();
		System.out.println(connection.isClosed());
	}
}
