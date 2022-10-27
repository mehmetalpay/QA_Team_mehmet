import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Deneme {

    @Test
    public void Deneme () {

        /*given()
                .when()
                .get("http://usersdemo.herokuapp.com/api/users?page=2")
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .assertThat().body("total_pages",equalTo(4))
                .assertThat().body("per_page",equalTo(3))
                .log().all();

    }*/
        RestAssured.baseURI = "http://usersdemo.herokuapp.com/api/users?page=2";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("");
        JsonPath jsonPathEvaluator = response.jsonPath();

        List<Integer> alljson = jsonPathEvaluator.getList("data");
        System.out.println(alljson);
        for (int i=0; i<alljson.size(); i++ )
        {
            System.out.println(alljson.get(i));

        }
}}
