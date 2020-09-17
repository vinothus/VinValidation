package com.vin.test;

import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.junit.Test;

import com.vin.validatior.EmailValidator;
import com.vin.validatior.Validator;

public class TestValidations {
	Logger log = Logger.getLogger(TestValidations.class.getName());
	
	@Test
	public void testEmailPositive()
	{
		
		String email="testmail@gmail.com";
		log.info(email);
		Validator<String> emailValidator=new EmailValidator();
		assertTrue(emailValidator.isValid(email));
		
	}
	@Test
	public void testEmailNegative()
	{
		
		String email="%%%$$$$$$testmail@gmail.com";
		Validator<String> emailValidator=new EmailValidator();
		log.info(email);
		assertTrue(!emailValidator.isValid(email));
		
	}
}
