package test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class basics {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://maps.googleapis.com";

		given().
		        param("radius","500");
	}

}
