package app.jpatesting.repository;

import app.jpatesting.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findById(long id);
}
