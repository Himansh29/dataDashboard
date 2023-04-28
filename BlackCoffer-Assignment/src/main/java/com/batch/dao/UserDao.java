package com.batch.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public UserDao() {
		
	}
	
	public int createTable() {
		String query = "create table if not exists User(id int primary key, name varchar(200), age int, city varchar(50))";
		int update = this.jdbcTemplate.update(query);
		System.out.println("Constructor called" + update);
		return update;
	}
	
	public void fetchAndPrintData() {
		String query = "SELECT end_year, citylng, citylat, intensity, sector, topic, insight, swot, url, region, start_year, impact, added, published, city, country, relevance, pestle, source, title, likelihood FROM data";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		for (Map<String, Object> row : rows) {
		    System.out.println("End Year: " + row.get("end_year"));
		    System.out.println("City Longitude: " + row.get("citylng"));
		    System.out.println("City Latitude: " + row.get("citylat"));
		    System.out.println("Intensity: " + row.get("intensity"));
		    System.out.println("Sector: " + row.get("sector"));
		    System.out.println("Topic: " + row.get("topic"));
		    System.out.println("Insight: " + row.get("insight"));
		    System.out.println("SWOT: " + row.get("swot"));
		    System.out.println("URL: " + row.get("url"));
		    System.out.println("Region: " + row.get("region"));
		    System.out.println("Start Year: " + row.get("start_year"));
		    System.out.println("Impact: " + row.get("impact"));
		    System.out.println("Added: " + row.get("added"));
		    System.out.println("Published: " + row.get("published"));
		    System.out.println("City: " + row.get("city"));
		    System.out.println("Country: " + row.get("country"));
		    System.out.println("Relevance: " + row.get("relevance"));
		    System.out.println("Pestle: " + row.get("pestle"));
		    System.out.println("Source: " + row.get("source"));
		    System.out.println("Title: " + row.get("title"));
		    System.out.println("Likelihood: " + row.get("likelihood"));
		}
	}
	
}
