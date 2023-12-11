package test.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.demo.models.Person;
import test.demo.repository.PersonneRepository;

import java.util.List;

@Service
public class PersonneService {

    @Autowired
    private PersonneRepository personRepository;


    public List<Person> findAll(){
        return personRepository.findAll();
    }
}
