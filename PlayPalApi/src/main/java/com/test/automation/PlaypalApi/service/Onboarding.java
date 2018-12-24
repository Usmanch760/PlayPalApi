package com.test.automation.PlaypalApi.service;

import java.io.File;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//import static io.restassured.RestAssured; 

public class Onboarding extends TestBase {
	
	

	
	
	
	@Test(priority=2)
	public void TC006_listAllUsers() {
		
		 logger = extent.startTest("listAllUsers");
		
		Response res =	RestAssured.given().
				        contentType("application/json").
				        get(ServiceURLS.list_users);
		
	 RestAssured.given().
		        contentType("application/json").
		        get(ServiceURLS.list_users).then().assertThat().statusCode(200);
	 
	 logger.log(LogStatus.PASS, "Test Case listAllUsers is passed");
		
		
		String data = res.asString();
		System.out.println("data is "+data);
	}
	

	
	@Test(priority=2)
	public void TC001_authentication() {
		
		 logger = extent.startTest("TC001_authentication");
		
		
		RestAssured.given().
		queryParam("email", ServiceURLS.test_email).
		queryParam("password", ServiceURLS.test_password).
	    when().post(ServiceURLS.login_user)
	    .then().assertThat().statusCode(200);
		
		 logger.log(LogStatus.PASS, "Test Case TC001_authentication is passed");
			
			
			
		
	
		
	}
	
	
	
	
	
	
	
	
}
