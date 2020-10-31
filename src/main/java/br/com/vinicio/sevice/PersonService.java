package br.com.vinicio.sevice;

import br.com.vinicio.dto.request.CreatePersonRequest;
import br.com.vinicio.dto.request.PersonMapper;
import br.com.vinicio.model.Person;
import br.com.vinicio.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public Person createPerson(CreatePersonRequest createPersonRequest) {
        return repository.createPerson(PersonMapper.INSTANCE.createPersonRequestToPerson(createPersonRequest));
    }

}
