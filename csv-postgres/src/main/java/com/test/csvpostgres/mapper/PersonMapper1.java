package com.test.csvpostgres.mapper;

import com.test.csvpostgres.entity.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class PersonMapper1 implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {

        Person person = new Person();

        person.setSsoid(resultSet.getString("ssoid"));

        person.setFormid(resultSet.getString("formid"));

        return person;
    }
}
