import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Base {

    @Test
    public void setup() {
        RestAssured.baseURI = "https://api.hellosign.com/v3/signature_request/";
        RestAssured.authentication = RestAssured.basic("0651dc005df5a3ab042b5271d1b914e0c18248cea683961250c170b464bf4cd7", "");

    }
}
