package com.test.automation.PlaypalApi.service;

public class ServiceURLS {
	
	public static  final String test_email = "usman18@dayrep.com";
	public static  final String test_password = "123456789";
	
	//public static final int allergy_ids []= {156,157};
	
	
   public static  final String baseUrl = "http://playpalrestservices-2138879799.us-east-2.elb.amazonaws.com/";  
	public static final String createUser = baseUrl+"onboarding/onboarding/create_user";
	
	public static final String list_users = baseUrl+"onboarding/rest/users/list_users";
	
	public static final String load_user_profile = baseUrl+"onboarding/rest/profile/load_user_profile";
	
	public static final String login_user   =  baseUrl+ "onboarding/rest/authentication/login_user";
	
	public static final String load_user_diseases = baseUrl+ "onboarding/rest/profile/load_user_diseases";
	
	public static final String load_user_allergies = baseUrl+ "onboarding/rest/profile/load_user_allergies";
	
	public static final String load_user_family_diseases = baseUrl+ "onboarding/rest/profile/load_user_family_diseases";
	
	
	public static final String load_user_medications = baseUrl+ "onboarding/rest/profile/load_user_medications";
	
	public static final String  update_user_allergies = baseUrl+ "onboarding/rest/profile/update_user_allergies";
	
	public static final String  update_user_diseases = baseUrl+ "onboarding/rest/profile/update_user_diseases";
	
	public static final String update_user_family_diseases	= baseUrl+ "onboarding/rest/profile/update_user_family_diseases";
	
	public static final String update_user_medications	=	baseUrl+ "onboarding/rest/profile/update_user_medications";
	
	public static final String get_ethnicities		=	baseUrl+ "edi/rest/ethnicities/get_ethnicities";
	
	public static final String get_medication_types	= 	baseUrl+ "edi/rest/medications/get_medication_types";				
	
	public static final String get_medications	= 	baseUrl+ "edi/rest/medications/get_medications";
	
	

}
