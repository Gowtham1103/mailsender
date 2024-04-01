package com.redweber.mailtester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriptionController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/subscribe")
    public void subscribe(@RequestBody String email) {
        emailService.sendSubscriptionEmail(email);
    }
}
