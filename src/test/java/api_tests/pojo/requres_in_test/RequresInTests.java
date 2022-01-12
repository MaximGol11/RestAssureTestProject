package api_tests.pojo.requres_in_test;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import api_tests.pojo.UserData;

import java.util.List;

import static io.restassured.RestAssured.given;

public class RequresInTests {

    @Test
    public void testGetUsers() {
        List<UserData> users = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then().log().body()
                .statusCode(200)
                .extract().body().jsonPath().getList("data", UserData.class);

        users.forEach(x -> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));

        Assert.assertTrue(users.stream().allMatch(x -> x.getEmail().endsWith("@reqres.in")));
    }



}
