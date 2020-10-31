package br.com.vinicio.resource;

import br.com.vinicio.dto.request.CreatePersonRequest;
import br.com.vinicio.model.Person;
import br.com.vinicio.sevice.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonResource {

    @Autowired
    private PersonService personService;

    @PostMapping("/")
    public Person createPerson(CreatePersonRequest createPersonRequest) {
        return personService.createPerson(createPersonRequest);
    }
}
