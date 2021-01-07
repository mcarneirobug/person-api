package com.matheus.personapi.service;

import com.matheus.personapi.dto.MessageResponseDTO;
import com.matheus.personapi.entity.Person;
import org.springframework.web.bind.annotation.RequestBody;

public interface PersonService {

    MessageResponseDTO createPerson(@RequestBody Person person);

}
