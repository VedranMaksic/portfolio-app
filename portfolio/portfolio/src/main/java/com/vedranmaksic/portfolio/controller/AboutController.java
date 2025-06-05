package com.vedranmaksic.portfolio.controller;

import com.vedranmaksic.portfolio.model.About;
import com.vedranmaksic.portfolio.service.AboutService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/about")
@CrossOrigin(origins = "http://localhost:3000") // frontend port


public class AboutController {
    private final AboutService aboutService;

    public AboutController(AboutService aboutService) {
        this.aboutService = aboutService;
    }

    @GetMapping
    public Optional<About> getAbout(){
        return aboutService.getAbout();
    }

    @PostMapping
    public About saveAbout(@RequestBody About about){
        return aboutService.saveAbout(about);
    }
}
