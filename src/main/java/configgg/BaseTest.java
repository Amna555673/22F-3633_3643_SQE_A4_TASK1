package configgg;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    public static void setup() {
        // Set up RestAssured base URL and authorization
        RestAssured.baseURI = Config.BASE_URL;
        RestAssured.authentication = RestAssured.oauth2(Config.TOKEN); // OAuth2 Authentication using the token
    }

    // Helper method to check responses
    public void checkResponse(Response response) {
        response.then().statusCode(204);  // Ensures the response status is 200
    }
    
}


