package test.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import test.demo.models.Person;

public interface PersonneRepository  extends JpaRepository<Person, Integer> {
    //@Query("SELECT p FROM Person p WHERE LOWER(p.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    Page<Person> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
