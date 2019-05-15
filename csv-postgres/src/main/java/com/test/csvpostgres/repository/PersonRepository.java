package com.test.csvpostgres.repository;

import com.test.csvpostgres.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
