package com.ankul.catsapi.repository;

import com.ankul.catsapi.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CatsRepository extends JpaRepository<Cat, String> {
}
