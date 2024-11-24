package twitt;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import configgg.BaseTest;
import configgg.Config;

import static io.restassured.RestAssured.given;

public class GetTest extends BaseTest {

    @Test
    public void testGetUserInfo() {
        // Sending GET request to GitHub API to fetch user details
        Response response = given()
                .pathParam("username", Config.USERNAME)
                .when()
                .get("/users/{username}");
        
        checkResponse(response); // Validate response
        response.then().log().body(); // Log the response body
    }
}


///200
