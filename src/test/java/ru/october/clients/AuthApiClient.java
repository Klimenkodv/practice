package ru.october.clients;

import io.restassured.response.Response;
import ru.october.models.AuthRequest;

public class AuthApiClient extends BaseApiClient {

    public static final String REGISTER = "api/auth/register";

    public static final String LOGIN = "api/auth/login";

    public AuthApiClient(String baseUrl) {
        super(baseUrl);
    }

    public Response register(AuthRequest user) {
        return post(REGISTER, user);
    }

    public Response login(AuthRequest user) {
        return post(LOGIN, user);
    }

    public Response registerWithBody(Object body) {
        return post(REGISTER, body);
    }

    public Response loginWithBody(Object body) {
        return post(LOGIN, body);
    }
}
