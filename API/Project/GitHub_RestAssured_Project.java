package testNGTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
public class GitHub_RestAssured_Project {
	RequestSpecification requestspec;
	ResponseSpecification responsespec;
    String SSHkey = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDvELBCcnYXi+ZucHdtleVw7KDdDVqzlroFRon9wMtq8ry9KIbaWVEli7qi34UbQva82fMzZ0JkO+E/9gqUnEKR/uvcKgZynn7vDjqqcc1dvMSLDaYcr1AF0utJPb9lFIl9fYN5KL5gvtUPPT3wZ8KkOYh1fO2MJhwQjRk4Ctvr/yqO5Ykz5EUgACdmcYM4NFYvOi2i9AH8BMaFaBRabRgg5/ROqk82c0t6Et5x5jEozI5/znUsvbGtdJ90aCD7Nnsw1nxqsj2ZuSgeSHQzt0ZAe/G9riNVDIbDGj5kgbk3+h18oSYzL97itgYujlg8AOOBXOE+pRUAvsZvZOaO9z1UZwFPqn0sY+YCH6PrJUJTitvS3VbPrkYU9UqfnNkEEjkVgzc+tDReD7LRNL9Brb5qLcR5aDjqrMdZdo0byEMqKs9u/oJzuoxUMg0I6pUb02T7c2NrMOlRQg8XNoT5bn/9WR+yQokCzGjKScFCLUmzKgJzKrbfTo85m2CUfvYVAq0=";
    int sshid;
    @BeforeClass
    public void setup()
    {
    	requestspec = new RequestSpecBuilder()
    			.setContentType(ContentType.JSON)
    			.setBaseUri("https://api.github.com")
    			.addHeader("Authorization","token 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")
    			.build();
    }	
@Test (priority=1)
public void postreq()
{
	String reqbody = "{\"title\": \"TestB11\", \"key\": \"" + SSHkey + "\" }";
	Response response = given().spec(requestspec).body(reqbody).when().post("/user/keys");
	String resbody = response.getBody().asPrettyString();
	System.out.println(reqbody);
	System.out.println(resbody);
	sshid = response.then().extract().path("id");
	System.out.println("id generated is " + sshid);
	
	response.then().statusCode(201);
}
@Test (priority=2)
public void getreq()
{
	 Response response = given().spec(requestspec).when().get("/user/keys");
	String resbody2 = response.getBody().asPrettyString();
	System.out.println(resbody2);
	response.then().statusCode(200);
}
@Test (priority=3)
public void delreq()
{
	 Response response = given().spec(requestspec).pathParam("keyId",sshid).when().delete("/user/keys/{keyId}");
	String resbody3 = response.getBody().asPrettyString();
	System.out.println(resbody3);
	response.then().statusCode(204);
}
}