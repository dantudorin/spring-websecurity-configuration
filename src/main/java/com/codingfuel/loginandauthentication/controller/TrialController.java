package com.codingfuel.loginandauthentication.controller;

import com.codingfuel.loginandauthentication.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TrialController {

    @GetMapping("/api/users/me")
    public ResponseEntity<Map> getDetails(){
        Map<String,Object> logMap = new HashMap<>();
        logMap.put("description",SecurityContextHolder.getContext().getAuthentication().getPrincipal());

        return new ResponseEntity<>(logMap, HttpStatus.OK);

    }

}
