package com.matheus.personapi.controller;

import com.matheus.personapi.dto.MessageResponseDTO;
import com.matheus.personapi.dto.request.PersonDTO;
import com.matheus.personapi.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) {
        return this.service.createPerson(personDTO);
    }

}
