package test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.demo.models.Person;

public interface PersonneRepository  extends JpaRepository<Person, Integer> {
}
