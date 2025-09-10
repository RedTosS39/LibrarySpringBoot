package ru.redtoss.library.LibrarySpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.redtoss.library.LibrarySpringBoot.models.Person;


@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
