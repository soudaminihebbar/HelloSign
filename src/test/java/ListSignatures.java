import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.hasItem;

public class ListSignatures extends Base {

    @Test
    public void listSignatures() {
        RestAssured
                .given()
                .get("list")
                .then()
                .assertThat()
                .statusCode(200)
                .body("signature_requests.signature_request_id", hasItem(signatureRequestId));
    }

}
