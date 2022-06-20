package com.ankul.catsapi.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;



@Entity
@Data
@Accessors(chain = true)
public class Cat {
    @Id
    private String id;
    @Column(name = "namecat")
    private String name;
    private LocalDate birthDay;
    private LocalDateTime createdAt;

}
