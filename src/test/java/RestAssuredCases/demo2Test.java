package RestAssuredCases;

/**
 * @Author ZhenZhong Zhu
 * @Date 2025/7/1 13:12
 * @Version 1.0
 * @Description ：无参get请求
 *
 */


import io.qameta.allure.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;


@Feature("案例域")
public class demo2Test {
    @BeforeAll
    public static void setup(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @DisplayName("无参get请求测试用例1")
    @Test
    public void testRequestWithGet(){
//        get请求，无参数
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/posts")
                .then()
                .extract().response();
        System.out.println(response.asString());
        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertEquals("qui est esse", response.jsonPath().getString("title[1]"));
        Assertions.assertEquals("2", response.jsonPath().getString("id[1]"));
    }
}
