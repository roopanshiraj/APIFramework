 package org.testing.TestSteps;

import org.testing.Resources.Body;
import org.testing.Resources.ResponseBody;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

import java.util.Properties;

public class HTTPMethods
{

public Response PostRequest (Properties pr, Body body) //handle POJO
	{
		
		Response res= 
				given()
			    .contentType(ContentType.JSON)
			    .body(body)
				.when()
				.post(pr.getProperty("Dev_URI"));
				return res;
	}		
				
public Response PostRequest (Properties pr, String body) //handle json
				{
					
					Response res= 
							given()
						    .contentType(ContentType.JSON)
						    .body(body)
							.when()
							.post(pr.getProperty("Dev_URI"));
							return res;			
				
				}

		public Response GetRequest (Properties pr, String id)  
		{
			
			String uri= pr.getProperty("Dev_URI") + id;
			
			Response res= 
			given()
			.contentType(ContentType.JSON)
			.when()
			.get(uri);
			
			return res;
			
		}


	}


