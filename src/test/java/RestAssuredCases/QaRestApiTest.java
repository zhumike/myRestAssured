package RestAssuredCases;
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

/**
 * @Author ZhenZhong Zhu
 * @Date 2025/7/1 11:17
 * @Version 1.0
 * @Description ：
 * 天气接口测试
 */

@Feature("天气域")
public class QaRestApiTest {

    private static final String BASE_URL = "https://api.seniverse.com/v3/weather/now.json";
    private static final String APP_KEY = "S8hJrD659XVmUa4sm";

    @BeforeAll
    public static void setup(){
        RestAssured.baseURI = BASE_URL;
    }

    @DisplayName("天气接口测试用例")
    @Test
    public void testWeatherApi() {

        String city = "上海";

        String requestUrl = BASE_URL +
                "?key=" + APP_KEY +
                "&location=" + city +
                "&language=zh-Hans&unit=c";
        System.out.println(requestUrl);

        Response response = given()
                .param("key", APP_KEY)
                .param("location", city)
                .param("language", "zh-Hans")
                .param("unit", "c")
                .when()
                .get()
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("results.location.name", hasItem(city))
                .extract().response();
        System.out.println(response.asString());
        Assertions.assertEquals("WTW3SJ5ZBJUY", response.jsonPath().getString("results.location[0].id"),"异常，请检查id值");

    }



}
