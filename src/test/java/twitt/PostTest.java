package twitt;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import configgg.BaseTest;
import static io.restassured.RestAssured.given;

public class PostTest extends BaseTest {

    @Test
    public void testCreateRepo() {
        // Dynamically generate a unique repository name
        String repoName = "new-repo-" + System.currentTimeMillis();
        String body = "{ \"name\": \"" + repoName + "\", \"description\": \"A new repository\", \"private\": false }";

        // Sending POST request to GitHub API to create a new repository
        Response response = given()
                .contentType("application/json")
                .body(body)
                .when()
                .post("/user/repos");

        checkResponse(response); // Validate response
        response.then().log().body(); // Log the response body

        // Additional Debugging
        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Response Body: " + response.body().asString());
    }
}

///201