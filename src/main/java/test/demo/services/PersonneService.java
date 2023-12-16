package test.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import test.demo.models.Person;
import test.demo.repository.PersonneRepository;

import java.util.List;

@Service
public class PersonneService {

    @Autowired
    private PersonneRepository personRepository;


    public Page<Person> findAll(Pageable pageable){

        return personRepository.findAll(pageable);
    }

    public Page<Person> searchPersons(String keyword, Pageable pageable) {
        return personRepository.findByNameContainingIgnoreCase(keyword, pageable);
    }
}
