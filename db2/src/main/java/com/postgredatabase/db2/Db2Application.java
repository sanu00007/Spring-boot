package com.postgredatabase.db2;

import javax.sql.DataSource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Db2Application implements  CommandLineRunner{

	private final DataSource datasource;

    public Db2Application(DataSource datasource) {
		this.datasource = datasource;
    }

	

	public static void main(String[] args) {
		SpringApplication.run(Db2Application.class, args);
	}

	@Override
	public void run(String... arg){
		JdbcTemplate jdbc = new JdbcTemplate(datasource);
		jdbc.execute("select 1");

	}
}
