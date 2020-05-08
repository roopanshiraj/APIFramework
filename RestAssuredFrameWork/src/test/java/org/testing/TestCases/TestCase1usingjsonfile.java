package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.Resources.ResponseBody;
import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.JsonRead;
import org.testing.Utilities.PropertiesLoad;
import org.testing.Utilities.ResponseParsing;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TestCase1usingjsonfile {
	
	static String id_value;
	
		
		@Test
		public void tc1() throws IOException
		{
			PropertiesLoad p= new PropertiesLoad(); //object create
			Properties properties= p.propertyFileLoad(); // method call
			
			String body= JsonRead.json_read("../RestAssuredFrameWork/src/test/java/org/testing/Resources/Data.json");
			HTTPMethods http= new HTTPMethods(); // object create
			Response response=  http.PostRequest(properties, body); // post call
			
			ResponseValidate.responseStatusCodeValidation(response, 201); // response status code validate
			
			
			ResponseParsing r = new ResponseParsing();
			id_value= r.responseParse(response, ".id" ).toString();
			
		}
}
