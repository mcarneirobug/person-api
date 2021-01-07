package com.matheus.personapi.service;

import com.matheus.personapi.dto.MessageResponseDTO;
import com.matheus.personapi.dto.request.PersonDTO;
import org.springframework.web.bind.annotation.RequestBody;

public interface PersonService {

    MessageResponseDTO createPerson(@RequestBody PersonDTO personDTO);

}
