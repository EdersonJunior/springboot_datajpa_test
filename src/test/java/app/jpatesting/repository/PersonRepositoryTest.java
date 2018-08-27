package app.jpatesting.repository;

import app.jpatesting.model.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class PersonRepositoryTest {

    private static final String PERSON_NAME = "Vaneleia";

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void findAll_whenRequestFindAll() {
        Person person = personRepository.findById(1l);
        Assert.assertTrue(person.getName().equals(PERSON_NAME));
    }

}