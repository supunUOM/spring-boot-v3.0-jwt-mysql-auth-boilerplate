package com.cupid.backend.auth.util;

import com.cupid.backend.auth.entity.User;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuthUtils {

    public static User getCurrentUser() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return user;
    }
}
