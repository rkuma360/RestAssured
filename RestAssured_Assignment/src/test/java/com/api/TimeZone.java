package com.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TimeZone {
	
	@Test
	
	public void timezone() {
		Response res=RestAssured.given().when()
				.baseUri("https://restcountries.eu/rest/v2/name/united").get();
		JsonPath jsonval=res.jsonPath();
		String timezone=jsonval.getString("timezones");
		System.out.println("Time zone:"+timezone);
		String currencies=jsonval.getString("currencies");
		System.out.println("currencies:"+currencies);
	}

}
