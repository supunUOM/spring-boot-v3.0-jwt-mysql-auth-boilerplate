package com.cupid.backend.auth.constant;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ADMIN,
    PARENT,
    USER;

    @Override
    public String getAuthority() {
        return null;
    }
}
