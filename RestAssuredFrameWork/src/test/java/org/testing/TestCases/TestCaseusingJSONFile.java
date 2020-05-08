package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.automationtesting.excelreport.Xl;
import org.testing.Resources.ResponseBody;
import org.testing.ResponseValidation.ResponseValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesLoad;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TestCaseusingJSONFile {
	
	
	@Test
	public void tc2() throws IOException

	{
		PropertiesLoad p= new PropertiesLoad(); //object create
		Properties properties= p.propertyFileLoad(); // method call
		
		HTTPMethods http= new HTTPMethods();
		Response r= http.GetRequest (properties, TestCase1usingjsonfile.id_value);
		
	     ResponseValidate.responseStatusCodeValidation(r, 200);
	

}
	
	@AfterSuite
	public void reports() throws Exception {
		
		Xl.generateReport("../testresult.xlsx");
		
	}
	
	
}
