package tests;
import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.List;
import java.util.Map;


public class BaseTest {
    public static void main(String[] args) {

        String baseUrl = "https://jsonplaceholder.typicode.com";

        RestAssured.baseURI = baseUrl;
        RequestSpecification request = RestAssured.given();


        Response response = request.get("/users");

        Assert.assertEquals(response.getStatusCode(), 200);

        String jsonString = response.asString();
        List<Map<String, String>> users = JsonPath.from(jsonString).get("username");
        //Assert.assertTrue(users.size() > 0);
        Assert.assertEquals("Delphine",users);

    }
}
