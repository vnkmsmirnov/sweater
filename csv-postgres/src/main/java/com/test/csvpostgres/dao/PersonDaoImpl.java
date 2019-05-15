package com.test.csvpostgres.dao;

import com.test.csvpostgres.entity.Person;
import com.test.csvpostgres.mapper.PersonMapper1;
import com.test.csvpostgres.mapper.PersonMapper2;
import com.test.csvpostgres.mapper.PersonMapper3;
import com.test.csvpostgres.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDaoImpl implements PersonDao {

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> getPersonLastHour() {
        String sql = "SELECT ssoid, formid FROM csv.csv_person WHERE ts >  ts - 3600";
        return jdbcTemplate.query(sql, new PersonMapper1());
    }

    @Override
    public List<Person> getPersonStartButNotSend() {
        String sql = "SELECT ssoid, subtype FROM csv.csv_person WHERE grp LIKE 'dszn_%'" +
                "AND subtype NOT LIKE 'start' AND subtype NOT LIKE 'send'";
        return jdbcTemplate.query(sql, new PersonMapper2());
    }

    @Override
    public List<Person> getBest5Form(){
        String sql = "SELECT DISTINCT formid, COUNT(formid) FROM csv.csv_person" +
                " GROUP BY formid HAVING COUNT(formid) > 1 LIMIT 5";
        return jdbcTemplate.query(sql, new PersonMapper3());
    }
}
