package fullstack.service;

import fullstack.model.Person;
import fullstack.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }

    public Person addPerson(Person person){
        return personRepository.save(person);
    }

    public void deletePerson(Person person){
        personRepository.delete(person);
    }

    private PersonRepository personRepository;
}
