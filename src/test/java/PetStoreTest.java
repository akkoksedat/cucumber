import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PetStoreTest {

    @Test
    public void testFindByStatus() {

        RestAssured.baseURI = "https://petstore.swagger.io/v2";


        Response response = RestAssured.given()
                .queryParam("status", "available") // Durum parametresi
                .when()
                .get("/pet/findByStatus");


        Assert.assertEquals(response.getStatusCode(), 200, "Yanıt kodu 200 olmalı");

        String responseBody = response.getBody().asString();


        Assert.assertTrue(responseBody.contains("id"), "Yanıt içinde 'id' bulunmalı");


        Assert.assertEquals(response.getHeader("Content-Type"), "application/json", "Content-Type başlığı 'application/json' olmalı");
    }
}
