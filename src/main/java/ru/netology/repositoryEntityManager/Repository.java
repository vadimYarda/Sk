package ru.netology.repositoryEntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.personEntity.Person;
import java.util.List;
import java.util.Optional;


public interface Repository extends JpaRepository<Person, Long> {

    // Поиск по городу
    List<Person> findByCity(String city);

    // Поиск по возрасту меньше заданного и сортировка по возрасту
    List<Person> findByAgeLessThanOrderByAgeAsc(int age);

    // Поиск по имени и фамилии
    Optional<Person> findByNameAndSurname(String name, String surname);
}
