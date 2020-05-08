package org.testing.TestCases;

import org.testing.Resources.ResponseBody;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesLoad;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;

import java.io.IOException;
import java.util.Properties;

public class TestCase2 {
	
	@Test
	public void tc2() throws IOException

	{
		PropertiesLoad p= new PropertiesLoad(); //object create
		Properties properties= p.propertyFileLoad(); // method call
		ResponseBody r= new ResponseBody();
		HTTPMethods http= new HTTPMethods();
		http.GetRequest (properties, r.getId());
		
		
		
	}
	

}
