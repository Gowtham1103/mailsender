package com.redweber.mailtester;

import com.redweber.mailtester.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriptionController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/subscribe")
    public ResponseEntity<String> subscribe(@RequestBody String email) {
        ResponseEntity<String> response = emailService.sendSubscriptionEmail(email);
        return response;
    }
}