package com.matheus.personapi.controller;

import com.matheus.personapi.dto.MessageResponseDTO;
import com.matheus.personapi.entity.Person;
import com.matheus.personapi.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person) {
        return this.service.createPerson(person);
    }

}
