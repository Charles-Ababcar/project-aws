package test.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import test.demo.models.Person;
import test.demo.services.PersonneService;

import java.util.List;


@RestController
public class BasicController {

	@Autowired
	private PersonneService personService;
	
	
	@GetMapping("/all")
	public Page<Person> getAll(Pageable pageable) {
		return personService.findAll(pageable);
	}


	@GetMapping("/search")
	public Page<Person> searchPersons(@RequestParam(name = "keyword") String keyword,
			Pageable pageable)
	{
		return personService.searchPersons(keyword, pageable);
	}
	
	
	
}