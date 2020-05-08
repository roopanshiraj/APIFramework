 package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.Resources.Body;
import org.testing.Resources.ResponseBody;
import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesLoad;
import org.testing.Utilities.ResponseParsing;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TestCase1 {
	
	@Test
	public void tc1() throws IOException
	{
		PropertiesLoad p= new PropertiesLoad(); //object create
		Properties properties= p.propertyFileLoad(); // method call
		
		 Body body =new Body(); //  body ready
		body.setId("Evita");
		body.setFirstname("Maria");
		body.setLastname("Francis");
		body.setAge(27);
		body.setDesignation("QA"); 
		
		HTTPMethods http= new HTTPMethods(); // object create
		Response response=  http.PostRequest(properties, body); // post call
		ResponseValidate.responseStatusCodeValidation(response, 201); // response status code validate
		
		ResponseParsing r = new ResponseParsing();
		String id_value= r.responseParse(response, ".id" ).toString();
		ResponseBody r1= new ResponseBody();
		r1.setId(id_value);
		
		
			
		}

}
