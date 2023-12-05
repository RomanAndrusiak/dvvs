package roman.andrusiak.dvvs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import roman.andrusiak.dvvs.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
