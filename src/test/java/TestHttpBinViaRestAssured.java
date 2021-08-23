import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

public class TestHttpBinViaRestAssured extends BaseTest {

    @Test
    public void testGivenRequestReturnOkStatusCodeAndContentTypeApplicationJson() {
        given()
                .spec(rspec)
                .get("/get")
                .then()
                .statusCode(200)
                .assertThat()
                .header("Content-Type", not(equalTo("application/json")));
    }


    @Test
    public void testPostGivenRequestReturnOkStatusCodeAndContentTypeApplicationJson() {
        given()
                .spec(rspec)
                .post("/post")
                .then()
                .statusCode(200)
                .assertThat()
                .header("Content-Type", equalTo("application/json"));
    }
}
