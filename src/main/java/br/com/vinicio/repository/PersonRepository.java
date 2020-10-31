package br.com.vinicio.repository;

import br.com.vinicio.model.Person;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.UUID;

@Repository
public class PersonRepository {

    HashMap<String, Person> mapPerson = new HashMap<>();

    public Person createPerson(Person person){
        mapPerson.put(UUID.randomUUID().toString(), person);
        return person;
    }
}
