package com.matheus.personapi.service;

import com.matheus.personapi.dto.MessageResponseDTO;
import com.matheus.personapi.dto.request.PersonDTO;
import com.matheus.personapi.exception.PersonNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PersonService {

    MessageResponseDTO createPerson(@RequestBody PersonDTO personDTO);

    List<PersonDTO> listAll();

    PersonDTO findById(Long id) throws PersonNotFoundException;

    void deleteById(Long id) throws PersonNotFoundException;

    MessageResponseDTO updateById(Long id, PersonDTO personDTO) throws PersonNotFoundException;

}
