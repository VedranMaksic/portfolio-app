package com.vedranmaksic.portfolio.service;

import com.vedranmaksic.portfolio.model.ContactMessage;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {


    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {

        this.mailSender = mailSender;
    }

    public void sendContactNotification(ContactMessage message) {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setFrom("maksic.vedran@gmail.com");
        email.setTo("maksic.vedran@gmail.com");
        email.setSubject("Nova kontakt poruka sa portfolia");
        email.setText("Ime: " + message.getName() + "\nEmail: " + message.getEmail() + "\nPoruka:\n" + message.getMessage());
        mailSender.send(email);
    }
}
