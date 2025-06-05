package com.vedranmaksic.portfolio.service;

import com.vedranmaksic.portfolio.model.ContactMessage;
import com.vedranmaksic.portfolio.repository.ContactMessageRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private final ContactMessageRepository contactMessageRepository;

    public ContactService(ContactMessageRepository contactMessageRepository) {
        this.contactMessageRepository = contactMessageRepository;
    }

    public void saveContactMessage(ContactMessage contactMessage){
        contactMessageRepository.save(contactMessage);
    }
}
