package com.test.csvpostgres.dao;

import com.test.csvpostgres.entity.Person;

import java.util.List;

public interface PersonDao {

    List<Person> getPersonLastHour();

    List<Person> getPersonStartButNotSend();

    List<Person> getBest5Form();
}
