/**
 * 
 */
package com.test.automation.PlaypalApi.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.RestAssured;
import io.restassured.response.Response;

/**
 * @author True Meridian
 *
 */
public class UserProfile  extends TestBase{
	
	

	
 
	 
	
	@Test(priority=0)
	public  void TC008_load_user_diseases() {
		
		 logger = extent.startTest("load_user_diseases");		
		 RestAssured.given().
	       
	    queryParam("user_id", "11").
	    when().post(ServiceURLS.load_user_diseases)
	    .then().assertThat().statusCode(200);
		 
		 logger.log(LogStatus.PASS, "Test Case load_user_diseases is passed");
	}
	
	@Test(priority=0)
	public  void TC008_load_user_allergies() {
		
		 logger = extent.startTest("load_user_allergies");	
		
		RestAssured.given().
	       
	    queryParam("user_id", "42").
	    when().post(ServiceURLS.load_user_allergies)
	    .then().assertThat().statusCode(200);
		
		Response res = RestAssured.given(). queryParam("user_id", "42").
			    when().post(ServiceURLS.load_user_allergies);
		
		String data = res.asString();
		System.out.println("user allergy data is "+data);
		
		 logger.log(LogStatus.PASS, "Test Case load_user_allergies is passed");
	}
	
	
	@Test(priority=0)
	public  void get_ethnicities() {
		
		 logger = extent.startTest("get_ethnicities");	
		 
		 Response res =	RestAssured.given().
			        contentType("application/json").
			        get(ServiceURLS.get_ethnicities);
		
		 RestAssured.given().
	        contentType("application/json").
	        get(ServiceURLS.get_ethnicities).then().assertThat().statusCode(200);
		
		String data = res.asString();
		System.out.println("get_ethnicities data is "+data);
		
		 logger.log(LogStatus.PASS, "Test Case get_ethnicities is passed");
	}
	
	
	@Test(priority=0)
	public  void get_medication_types() {
		
			
		 
		 Response res =	RestAssured.given().
			        contentType("application/json").
			        get(ServiceURLS.get_medication_types);
		 
		 logger = extent.startTest("get_medication_types");
		
		 RestAssured.given().
	        contentType("application/json").
	        get(ServiceURLS.get_medication_types).then().assertThat().statusCode(200);
		
		String data = res.asString();
		System.out.println("get_medication_types data is "+data);
		
		 logger.log(LogStatus.PASS, "Test Case get_medication_types is passed"+"\n response is:   "+data);
	}
	
	
	@Test(priority=0)
	public  void get_medications() {
		
			
		 
		 Response res =	RestAssured.given().
			        contentType("application/json").
			        get(ServiceURLS.get_medications);
		 
		 logger = extent.startTest("get_medications");
		
		 RestAssured.given().
		 queryParam("name_hint", "pan").
	        contentType("application/json").
	        get(ServiceURLS.get_medications).then().assertThat().statusCode(200);
		
		
		 logger.log(LogStatus.PASS, "Test Case get_medications is passed");
		 
	}
	
	
	
	@Test(priority=0)
	public  void TC008_load_user_family_diseases() {
		
		 logger = extent.startTest("user_family_diseases");	
		
		RestAssured.given().
	       
	    queryParam("user_id", "11").
	    when().post(ServiceURLS.load_user_family_diseases)
	    .then().assertThat().statusCode(200);
		
		 logger.log(LogStatus.PASS, "Test Case load_user_family_diseases is passed");
	}
	
	
	
	
	@Test(priority=0)
	public  void TC007_load_user_profile() {
		
		 logger = extent.startTest("load_user_profile");	
		
		RestAssured.given().
	       
	    queryParam("user_id", "11").
	    when().post(ServiceURLS.load_user_profile)
	    .then().assertThat().statusCode(200);
		
		 logger.log(LogStatus.PASS, "Test Case load_user_profile is passed");
	}
	
	
	@Test(priority=0)
	public  void TC007_update_user_allergies() {
		 logger = extent.startTest("update_user_allergies");	
		List<String> values = new ArrayList<String>();
		values.add("156");
		values.add("158");
		
		RestAssured.given().
	     
		queryParam("user_id", "11").
		param("allergy_ids", values).
		
	    when().post(ServiceURLS.update_user_allergies)
	    .then().assertThat().statusCode(200);
		
		 logger.log(LogStatus.PASS, "Test Case update_user_allergies is passed");
		
		// for validating the changes we will call load user allergy
		
		//TC008_load_user_allergies();
		
		
		
	}
	
	
	
	
	@Test(priority=0)
	public  void update_user_diseases() {
		 logger = extent.startTest("update_user_diseases");	
		List<String> values = new ArrayList<String>();
		values.add("2");
		values.add("3");
		
	    RestAssured.given().
	     
		queryParam("user_id", "42").
		param("disease_ids", values).
		
	    when().post(ServiceURLS.update_user_diseases)
	    .then().assertThat().statusCode(200);
		
		
		Response res =	RestAssured.given().
	     
		queryParam("user_id", "42").
		param("disease_ids", values).
		
	    when().post(ServiceURLS.update_user_diseases);
		
		String response_data = res.asString();
		System.out.println("response disease is "+response_data);
		
		logger.log(LogStatus.PASS, "Test Case update_user_diseases is passed");
		
		
	}
	
	@Test(priority=0)
	public  void update_user_family_diseases() {
		 logger = extent.startTest("update_user_family_diseases");	
		List<String> values = new ArrayList<String>();
		values.add("211");
		values.add("212");
		
	    RestAssured.given().
	     
		queryParam("user_id", "42").
		param("disease_ids", values).
		
	    when().post(ServiceURLS.update_user_family_diseases)
	    .then().assertThat().statusCode(200);
		
		
		Response res =	RestAssured.given().
	     
		queryParam("user_id", "42").
		param("disease_ids", values).
		
	    when().post(ServiceURLS.update_user_family_diseases);
		
		String response_data = res.asString();
		System.out.println("response family diseases: "+response_data);
		
		logger.log(LogStatus.PASS, "Test Case update_user_family_diseases is passed");
		
		
	}
	
	@Test(priority=0)
	public  void update_user_medications() {
		 logger = extent.startTest("update_user_medications");	
		List<String> values = new ArrayList<String>();
		values.add("211");
		values.add("212");
		
	    RestAssured.given().
	     
		queryParam("user_id", "42").
		param("medication_ids", values).
		
	    when().post(ServiceURLS.update_user_medications)
	    .then().assertThat().statusCode(200);
		
		
		Response res =	RestAssured.given().
	     
		queryParam("user_id", "42").
		param("medication_ids", values).
		
	    when().post(ServiceURLS.update_user_medications);
		
		String response_data = res.asString();
		System.out.println("response  medications: "+response_data);
		logger.log(LogStatus.PASS, "Test Case update_user_medications is passed");
		
		
	}
	
	
	


	
	
	

}
