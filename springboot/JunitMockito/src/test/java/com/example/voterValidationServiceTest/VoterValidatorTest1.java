package com.example.voterValidationServiceTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.example.voterValidationService.InvalidVoterException;
import com.example.voterValidationService.VoterValidator;


public class VoterValidatorTest1
{

	private static VoterValidator vv;

		@BeforeAll // @BeforeEach
		public static void setUp()
		{
			vv= new VoterValidator();
		}
		
		@AfterAll // @AfterEach
		public static void cleanUp()
		{
			vv= null;
		}

	@Test
	@Order(1)
	@Tag("dev")
	public void validateVoterAgeValidTest() throws InvalidVoterException
	{
		int age = 18;

		
		boolean result=vv.validateVoterAge(age);
		assertTrue(result);

	}

	@Test
	@Order(2)
	@Tag("test")
	public void validateVoterAgeInvalidTest() throws InvalidVoterException
	{
		int age = 15;
		
		boolean result=vv.validateVoterAge(age);
		assertFalse(result);
	}

	@Test
	@Order(3)
	@Tag("prod")
	public void validateVoterAgeInvalidExcptionTest() throws InvalidVoterException
	{
		int age = -1;
		
		Exception e= assertThrows(InvalidVoterException.class, ()-> vv.validateVoterAge(age));
		assertEquals("enter a valid age",e.getMessage());

	}


	@Order(4)
	@Tag("prod")
	@ParameterizedTest
	@CsvSource(value= {"19,true","20,true","17,false","16,false"})
	public void validateVoterAgeParameterizedTest(int age,boolean expected) throws InvalidVoterException
	{
		
		boolean actual=vv.validateVoterAge(age);
		assertEquals(expected,actual);

	}
}