package br.com.vinicio.dto.request;

import br.com.vinicio.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "documento", target = "documento")
     Person createPersonRequestToPerson(CreatePersonRequest createPersonRequest);

}
