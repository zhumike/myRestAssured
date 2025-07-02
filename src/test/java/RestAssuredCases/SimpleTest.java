package RestAssuredCases;

/**
 * @Author ZhenZhong Zhu
 * @Date 2025/7/1 11:35
 * @Version 1.0
 * @Description ：带参数的get请求
 */
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;



public class SimpleTest {


//    @BeforeAll
    @BeforeTest
    public static void setup() {
        RestAssured.baseURI = "https://m.douban.com/rexxar/api/v2/movie/36882158?";
    }

    @Test
    public void testGetMovieDetails() {

        /**
         * @Author ZhenZhen Zhu
         * @Description:
         * @Date 2025/7/1  14:20
         * 豆瓣电影接口测试
         * @return void
         */
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Referer", "https://m.douban.com/movie/subject/36882158/");
        headers.put("X-Requested-With", "XMLHttpRequest");
        headers.put("User-Agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Mobile Safari/537.36");
        headers.put("Accept", "application/json");
        headers.put("sec-ch-ua-mobile", "?1");


        given()
                .headers(headers)
                .param("for_mobile", "1")
                .when()
                .get()
                .then()
                .body("rating.count",equalTo(25035))
                .statusCode(200);  // 验证响应状态码为200

    }
}