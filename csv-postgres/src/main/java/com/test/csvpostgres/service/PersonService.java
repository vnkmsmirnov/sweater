package com.test.csvpostgres.service;

import com.test.csvpostgres.entity.Person;

import java.util.List;

public interface PersonService {

    List<Person> getPersonLastHour();

    List<Person> getPersonStartButNotSend();

    List<Person> getBest5Form();
}
