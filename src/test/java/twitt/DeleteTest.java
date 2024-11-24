package twitt;
import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import configgg.BaseTest;
import configgg.Config;
import io.restassured.response.Response;

public class DeleteTest extends BaseTest {

    @Test
    public void testDeleteRepo() {
        // Sending DELETE request to GitHub API to delete a repository
        Response response = given()
                .pathParam("owner", Config.OWNER)
                .pathParam("repo", Config.REPO_NAME)
                .when()
                .delete("/repos/{owner}/{repo}");

        checkResponse(response); // Validate response
        response.then().log().body(); // Log the response body
    }
}
//204