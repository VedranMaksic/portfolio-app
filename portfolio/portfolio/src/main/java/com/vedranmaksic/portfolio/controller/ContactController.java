package com.vedranmaksic.portfolio.controller;

import com.vedranmaksic.portfolio.model.ContactMessage;
import com.vedranmaksic.portfolio.service.ContactService;
import com.vedranmaksic.portfolio.service.EmailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {

    private final ContactService contactService;

    private final EmailService emailService;

    public ContactController(ContactService contactService, EmailService emailService) {
        this.contactService = contactService;
        this.emailService = emailService;
    }

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody ContactMessage contactMessage){
        contactService.saveContactMessage(contactMessage);
        emailService.sendContactNotification(contactMessage);
        return ResponseEntity.ok("Successfully sent!\n");
    }



}
