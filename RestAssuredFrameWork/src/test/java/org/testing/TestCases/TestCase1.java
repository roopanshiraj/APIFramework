 package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.Resources.Body;
import org.testing.Utilities.PropertiesLoad;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@Test
	public void tc1() throws IOException
	{
		PropertiesLoad p= new PropertiesLoad();
		Properties properties= p.propertyFileLoad();
		
		Body body =new Body();
		body.setId("Evita");
		body.setFirstname("Maria");
		body.setLastname("Francis");
		body.setAge(27);
		body.setDesignation("QA");
			
		}

}
