package test.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import test.demo.models.Person;
import test.demo.services.PersonneService;

import java.util.List;


@RestController
public class BasicController {

	@Autowired
	private PersonneService personService;
	
	
	@GetMapping("/all")
	public List<Person> getAll() {
		
		return personService.findAll();
	}
	
	
	
}