package com.ankul.catsapi.controller;

import com.ankul.catsapi.dto.CatDto;
import com.ankul.catsapi.entity.Cat;
import com.ankul.catsapi.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatsController {

    private final CatService catService;

    @PostMapping
    public Cat save(@RequestBody CatDto cat) {
        return catService.saveDto(cat);
    }

    @GetMapping
    public Iterable<Cat> getAll() {
        return catService.getAll();
    }
}
