package com.zhang.datasource.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDatasource {

	private ApplicationContext  ctx = null;
	{
		ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
	}
	@Test
	public void  TestDatasource() throws SQLException{
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());
	}
}
