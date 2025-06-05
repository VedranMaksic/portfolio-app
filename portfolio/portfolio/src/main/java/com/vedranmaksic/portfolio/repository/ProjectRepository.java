package com.vedranmaksic.portfolio.repository;

import com.vedranmaksic.portfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
