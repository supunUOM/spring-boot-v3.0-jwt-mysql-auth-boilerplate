package com.cupid.backend.auth.controller;

import com.cupid.backend.auth.entity.User;
import com.cupid.backend.auth.util.AuthUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/api/v1/demo-controller")
public class DemoController {

    @GetMapping()
    public ResponseEntity<String> sayHello() {
        User user = AuthUtils.getCurrentUser();
        System.out.println("======================" + user);
        return ResponseEntity.ok("Hello from secured endpoint");
    }
}
