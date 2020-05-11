package stepDefinations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import static org.hamcrest.Matchers.*;

import org.hamcrest.core.IsEqual;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.deps.com.google.gson.JsonArray;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.internal.ResponseSpecificationImpl.HamcrestAssertionClosure;
import io.restassured.path.json.JsonPath;
import  io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;
import io.restassured.response.ValidatableResponse;
import jdk.nashorn.internal.ir.RuntimeNode.Request;


public class restAssuredStepdefGet{
	Response response;
    @Given("^URI is \"([^\"]*)\"$")
    public void uri_is_something(String strArg1) throws Throwable {
        RestAssured.baseURI=strArg1;
        
    }

    @When("^user send a request to get wheather of \"([^\"]*)\"$")
    public void user_send_a_request_to_get_wheather_of_something(String strArg1) throws Throwable {
       response= RestAssured.given().request(Method.GET,"/"+strArg1 );
       
       
    }

    @Then("^user get the response of Weather$")
    public void user_get_the_response_of_weather() throws Throwable {
      System.out.println("contenttype is="+response.getContentType()); //application/json
      System.out.println("headeris="+response.getHeaders()); 
      System.out.println("statuscode is="+response.getStatusCode()); //200
      System.out.println("statusline="+response.getStatusLine()); //HTTP/1/ 200OK
      String s=response.getBody().jsonPath().get("City");
      System.out.println(s);
      response.then().log().all();
      response.then().body("City",hasItem("Bengaluru"));
    //response.then().assertThat().body("City", hasItem("Bengaluru")) ; 
     // String s= response.getBody().asString();
       System.out.println(s);
    }
    
    
   

    @When("^user send a request \"([^\"]*)\"$")
    public void user_send_a_request_something(String strArg1) throws Throwable {
    	response=RestAssured.given().request(Method.GET,"/"+strArg1);
    	//RestAssured.given().get()
    	
    }
    
    @Then("^verify the error code in response$")
    public void errorresponse() {
    	String responsebody=response.getBody().asString();
    	  System.out.println("resposne is="+responsebody);
    	
    	
    }

    @Then("^verify the response of country \"([^\"]*)\"$")
    public void verify_the_response_something(String g1) throws Throwable {
       String responsebody=response.getBody().asString();
       
      Map<String,Object>map= response.getBody().jsonPath().get("[0].translations");
      map.get("de");
      int size=map.size();
      System.out.println(size);
      System.out.println( map.get("de"));
      List<String>l=new ArrayList<String>();
      l.add("AFG");
    		    
      List<String>list=response.getBody().jsonPath().get("[1].borders");
      int Listsize=list.size();
      System.out.println(Listsize);
      System.out.println(list.containsAll(l));
    List<String>list1=response.getBody().jsonPath().getList("[1].borders");
     System.out.println(list1.get(0));
		/*
		 * List<translations>
		 * Alltranslations=response.jsonPath().getList("[0].translations",
		 * translations.class); for(translations tr:Alltranslations) { String s=tr.de;
		 * System.out.println("str="+s); }
		 */
       //response.jsonPath().geto
       System.out.println("resposne is="+responsebody);
       System.out.println(response.getStatusCode());
       System.out.println(response.getStatusLine());
       Assert.assertTrue(responsebody.contains(g1));
       
       
    }
    @When("^Check the capital \"([^\"]*)\"$")
    public void check_the_capital_something(String strArg1) throws Throwable {
       // throw new PendingException();
    	//RestAssured.given().auth().preemptive().basic(username, password)
    	//RestAssured.given().auth().oauth(consumerKey, consumerSecret, accessToken, secretToken)
    	//RestAssured.given().auth().oauth2(accessToken)
    	response=RestAssured.given().get("/"+strArg1);
    	
    	
    	//or RestAssured.given().get("/"+strarg1)
    	String str=response.then().extract().asString();
    	ResponseBodyExtractionOptions rbeo=response.then().extract().body();
    	String capital=response.then().extract().body().path("[0].capital");
   ;
    	Assert.assertEquals(capital, "Oslo");
    	JsonPath jsonpath=rbeo.jsonPath();
    	String str1=jsonpath.get("[0].name");
    	System.out.println("str1="+str1);
    
    	String aalpha=response.jsonPath().get("[0].alpha3Code");
    	System.out.println("aalpha="+aalpha);
    	   	
    	
    }

    @Then("^print the details in commandline$")
    public void print_the_details_in_commandline() throws Throwable {
    	
    	List<String>resp=response.jsonPath().getList("[0].altSpellings");
    	for(String i:resp) {
    		System.out.println(i);
    	}
    	Map<String,String>m1=new HashMap<String,String>();	
    	
		  m1.put("it","Norvegia");
		  m1.put("fr","Norvège");
		 
    	Map<String,String>map=new HashMap<String,String>();
    	map=response.jsonPath().getMap("[0].translations");
    	
    	for(Entry<String, String> m:map.entrySet()) {
    		System.out.println(m);
    	}
       System.out.println(response.then().extract().asString());
    }

    
}

