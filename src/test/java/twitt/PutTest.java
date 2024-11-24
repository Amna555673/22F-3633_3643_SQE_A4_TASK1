package twitt;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import configgg.BaseTest;
import configgg.Config;

import static io.restassured.RestAssured.given;

public class PutTest extends BaseTest {

    @Test
    public void testGetRepo() {
        // Sending GET request to GitHub API to fetch repository details
        Response response = given()
            .pathParam("owner", Config.OWNER)  // GitHub username (owner of the repo)
            .pathParam("repo", Config.REPO_NAME)  // Repository name
            .when()
            .get("/repos/{owner}/{repo}");  // Correct endpoint for repository details

        // Log the response body for debugging
        response.then().log().body();
    }
}
//204