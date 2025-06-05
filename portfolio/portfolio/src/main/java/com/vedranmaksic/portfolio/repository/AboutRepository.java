package com.vedranmaksic.portfolio.repository;

import com.vedranmaksic.portfolio.model.About;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutRepository extends JpaRepository<About, Long> {
        }
