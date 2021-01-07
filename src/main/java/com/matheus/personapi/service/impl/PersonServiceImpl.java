package com.matheus.personapi.service.impl;

import com.matheus.personapi.dto.MessageResponseDTO;
import com.matheus.personapi.entity.Person;
import com.matheus.personapi.repository.PersonRepository;
import com.matheus.personapi.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository repository;

    public PersonServiceImpl(PersonRepository repository) {
        this.repository = repository;
    }

    /**
     * Design Pattern Builder
     * Utilizando o Builder evitamos criar o construtor no MessageResponse
     * e com isso é feito um tratamento de encapsulamento dos dados de entrada.
     * O lombok criando um MessageResponseDTOBuilder gerando todos os métodos para
     * preencher os dados.
     */
    @Override
    public MessageResponseDTO createPerson(Person person) {
        final var savedPerson = repository.save(person);

        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }

}
