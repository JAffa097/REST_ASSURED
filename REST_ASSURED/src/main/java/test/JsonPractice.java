package test;

import io.restassured.path.json.JsonPath;

public class JsonPractice {
	public static String data="{\r\n"
			+ "  \"id\": 64209690,\r\n"
			+ "  \"name\": \"Jane Smith\",\r\n"
			+ "  \"email\": \"jane.smith@gmail.com\",\r\n"
			+ "  \"phone\": \"07777 888 999\",\r\n"
			+ "  \"address\": {\r\n"
			+ "    \"street\": \"Flat 1, 188 High Street Kensington\",\r\n"
			+ "    \"postcode\": \"W8 5AA\",\r\n"
			+ "    \"city\": \"London\",\r\n"
			+ "    \"country\": \"United Kingdom\"\r\n"
			+ "  },\r\n"
			+ "  \"personal\": {\r\n"
			+ "    \"DOB\": \"1982-08-16\",\r\n"
			+ "    \"age\": 33,\r\n"
			+ "    \"gender\": \"female\"\r\n"
			+ "  },\r\n"
			+ "  \"connections\": [\r\n"
			+ "    {\r\n"
			+ "      \"id\": \"35434004285760\",\r\n"
			+ "      \"name\": \"John Doe\",\r\n"
			+ "      \"connType\": \"friend\",\r\n"
			+ "      \"since\": \"2014-03-25\"\r\n"
			+ "    },\r\n"
			+ "    {\r\n"
			+ "      \"id\": 13418315,\r\n"
			+ "      \"name\": \"James Smith\",\r\n"
			+ "      \"connType\": \"relative\",\r\n"
			+ "      \"relation\": \"husband\",\r\n"
			+ "      \"since\": \"2012-07-03\"\r\n"
			+ "    }\r\n"
			+ "  ],\r\n"
			+ "  \"feeds\": {\r\n"
			+ "    \"news\": true,\r\n"
			+ "    \"sport\": true,\r\n"
			+ "    \"fashion\": false\r\n"
			+ "  },\r\n"
			+ "  \"createdAt\": \"2015-09-22T10:30:06.000Z\"\r\n"
			+ "}";

	public static void main(String[] args) {
		JsonPath jp = new JsonPath(data);

	}

}
