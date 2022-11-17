package com.customer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class CustomerTest {

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int Contact=0;
		int Cust_Name=0;
		if(Contact<=1)
		{
			System.out.println("Customer detail added");
		}
		else
		{
			System.out.println("failled");
		}
		if(Cust_Name<=1)
		{
			System.out.println("Customer detail added");
		}
		else
		{
			System.out.println("failled");
		}
	}

    /**
     * Rigorous Test 🙂
     
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }*/
}