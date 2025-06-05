package com.vedranmaksic.portfolio.service;

import com.vedranmaksic.portfolio.model.About;
import com.vedranmaksic.portfolio.repository.AboutRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AboutService {
    private final AboutRepository aboutRepository;


    public AboutService(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    public Optional<About> getAbout(){
        return aboutRepository.findAll().stream().findFirst();
    }

    public About saveAbout(About about){
        return aboutRepository.save(about);
    }
}
