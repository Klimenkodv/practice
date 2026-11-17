package ru.october.models;

public record AuthRequest (
    String email,
    String password
) {}
