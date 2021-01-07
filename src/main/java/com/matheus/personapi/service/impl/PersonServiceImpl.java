package com.matheus.personapi.service.impl;

import com.matheus.personapi.dto.MessageResponseDTO;
import com.matheus.personapi.dto.request.PersonDTO;
import com.matheus.personapi.mapper.PersonMapper;
import com.matheus.personapi.repository.PersonRepository;
import com.matheus.personapi.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository repository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

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
    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        final var savedToSave = personMapper.toModel(personDTO);

        final var savedPerson = this.repository.save(savedToSave);

        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }

}
