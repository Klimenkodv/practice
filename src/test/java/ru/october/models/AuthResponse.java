package ru.october.models;

public record AuthResponse (
        String accessToken,
        String refreshToken
) {
    public record User (
            String email,
            Long id
    ) {}
}
