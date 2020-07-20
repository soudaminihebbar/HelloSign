import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.File;

public class SignatureRequest extends Base {
    final File file = new File("Test.pdf");

    @Test
    public void signatureRequest() {
        RestAssured
                .given()
                .contentType("multipart/form-data")
                .multiPart("test_mode","1")
                .multiPart(file)
                .multiPart("signers[0][name]","Mini")
                .multiPart("signers[0][email_address]", "soudamini.hebbar@gmail.com")
                .post("send")
                .then()
                .assertThat()
                .statusCode(200);
    }
}
