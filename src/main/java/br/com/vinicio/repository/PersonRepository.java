package br.com.vinicio.repository;

import br.com.vinicio.dto.person.Person;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepository {

    private Person createPerson(String nome, String documento){
        return new Person();
    }
}
