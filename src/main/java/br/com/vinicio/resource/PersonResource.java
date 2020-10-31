package br.com.vinicio.resource;

import br.com.vinicio.dto.person.Person;
import br.com.vinicio.dto.person.PersonRequestDTO;
import br.com.vinicio.sevice.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonResource {

    @Autowired
    private PersonService personService;

    public Person createPerson(PersonRequestDTO personRequestDTO) {
        return null;
    }

}
