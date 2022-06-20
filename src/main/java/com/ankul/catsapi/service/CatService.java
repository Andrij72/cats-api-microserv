package com.ankul.catsapi.service;

import com.ankul.catsapi.dto.CatDto;
import com.ankul.catsapi.entity.Cat;
import com.ankul.catsapi.repository.CatsRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatService {

    private final CatsRepository catsRepository;

    public Cat saveDto(CatDto catDto) {
        Cat cat = new Cat();

        cat.setName(catDto.getName())
                .setBirthDay(catDto.getBirthDate())
                .setId(UUID.randomUUID().toString())
                .setCreatedAt(LocalDateTime.now());
        return catsRepository.save(cat);
    }

    public Iterable<Cat> getAll() {
        return catsRepository.findAll();
    }
}
