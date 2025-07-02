package RestAssuredCases;

/**
 * @Author ZhenZhong Zhu
 * @Date 2025/7/1 14:52
 * @Version 1.0
 * @Description ：用户接口信息数据
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
import static org.hamcrest.Matchers.hasItem;

@Owner("zhenzhong zhu")
@Feature("用户域数据")
public class UserDataTest {


    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users?";
    }

    @DisplayName("用户信息用例1")
    @Description("测试用户信息返回是否正确")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void testUserData(){
        Response response = given()
                .contentType(ContentType.JSON)
                .param("a", 1)
                .when()
                .get()
                .then()
                .statusCode(200)
                .body("address.street",hasItem("Kulas Light"))
                .extract().response();

        System.out.println(response.asString());
        Assertions.assertEquals("Leanne Graham", response.jsonPath().getString("name[0]"));


        }

    @DisplayName("用户信息用例2")
    @Description("测试用户信息id是否正确")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void testUserData2(){
        Assertions.assertEquals(2,2,"校验相等demo");
    }


}
