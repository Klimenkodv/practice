package ru.october.clients;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseApiClient {

    protected final String baseUrl;

    public BaseApiClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    protected RequestSpecification request(){
        return given()
                .baseUri(baseUrl)
                .contentType("application/json")
                .accept("application/json");
    }

    protected Response get (String endpoint) {
        return request()
                .when()
                .get(endpoint);
    }

    protected Response post (String endpoint, Object body) {
        return request()
                .body(body)
                .when()
                .post(endpoint);
    }

    protected Response patch (String endpoint, Object body) {
        return request()
                .body(body)
                .when()
                .patch(endpoint);
    }
}
