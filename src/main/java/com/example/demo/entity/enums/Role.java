package com.example.demo.entity.enums;

public enum Role {
    ADMIN("ADMIN"), USER("USER");

    private final String displayName;

    Role(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() {
        return this.displayName;
    }
}