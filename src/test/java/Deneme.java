import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONValue;
import org.testng.annotations.Test;
//import org.json.simple.JSONObject;
//import org.json.simple.JSONValue;

import java.util.List;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class Deneme {
    @Test
    public void Deneme () {
        /*given()
                .when()
                .get("https://dummy.restapiexample.com/api/v1/employees")
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .assertThat().body("total_pages",equalTo(4))
                .assertThat().body("per_page",equalTo(3))
                .log().all();
    }*/
        RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/employees";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("");
        JsonPath jsonPathEvaluator = response.jsonPath();
        Object alljson = jsonPathEvaluator.get("data");
        Object obj= JSONValue.parse(alljson);

        System.out.println(alljson);
//        String employeeName = alljson.getJSONObject
//                ("data").getString("employee_name");
//        for (int i=0; i<alljson.size(); i++ )
//        {
//            System.out.println(alljson.get(i));
//
//        }
    }}
