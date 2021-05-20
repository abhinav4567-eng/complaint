//package com.cog.complaintapi.controller.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class PersistenceConfiguration {
//	
//	@Bean
//	public DataSource dataSource() {
//		DataSourceBuilder builder = DataSourceBuilder.create();
//		builder.url("jdbc:mysql://localhost:3306/complaintmanager?createDatabaseIfNotExist=true");
//		System.out.println("My custom DataSource has been Initiated and set");
//         return builder.build();
//}
//}