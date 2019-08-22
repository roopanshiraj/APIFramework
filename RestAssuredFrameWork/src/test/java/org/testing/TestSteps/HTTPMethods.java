 package org.testing.TestSteps;

import org.testing.Resources.Body;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

import java.util.Properties;

public class HTTPMethods
{

public Response PostRequest (Properties pr, Body body)
	{
		
		Response res= 
				given()
			    .contentType(ContentType.JSON)
			    .body(body)
				.when()
				.post(pr.getProperty("Dev_URI"));
				return res;




	}

}
