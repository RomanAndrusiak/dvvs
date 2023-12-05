package roman.andrusiak.dvvs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roman.andrusiak.dvvs.models.Person;
import roman.andrusiak.dvvs.repositories.PeopleRepository;

import java.util.List;

@Service
public class PeopleService {
    private final PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<Person> getAll() {
        return peopleRepository.findAll();
    }

    public Person getById(int id) {
        return peopleRepository.findById(id).stream().findAny().orElse(null);
    }

    public void save(Person person) {
        peopleRepository.save(person);
    }

    public void delete(int id) {
        peopleRepository.deleteById(id);
    }

    public void edit(Person person, int id) {
        person.setId(id);
        peopleRepository.save(person);
    }
}
