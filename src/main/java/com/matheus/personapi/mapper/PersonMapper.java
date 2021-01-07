package com.matheus.personapi.mapper;

import com.matheus.personapi.dto.request.PersonDTO;
import com.matheus.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    /**
     * Utilizando dessa anotação o MapStruct se encarrega de converter o tipo String
     * passado para o tipo de dados de Data para salvar no banco de dados.
     */
    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);

}
