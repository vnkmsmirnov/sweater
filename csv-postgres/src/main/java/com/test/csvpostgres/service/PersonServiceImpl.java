package com.test.csvpostgres.service;


import com.opencsv.CSVReader;
import com.test.csvpostgres.dao.PersonDao;
import com.test.csvpostgres.entity.Person;
import com.test.csvpostgres.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    PersonDao personDao;

    @SuppressWarnings("resource")
    public void savePersonData() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\Михаил\\JAVA.CSV.TEST\\test_case.csv"), ';', '"', 1);
            String[] nextLine;
            int ts = 0;
            String pattern = "YYYY-MM-DD-HH";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            Date date;

            while ((nextLine = csvReader.readNext()) != null) {
                Person person = new Person();

                person.setSsoid(nextLine[0]);

                if (nextLine[1] != null) {
                    ts = Integer.parseInt(nextLine[1]);
                    person.setTs(ts);
                } else person.setTs(0);

                person.setGrp(nextLine[2]);
                person.setType(nextLine[3]);
                person.setSubtype(nextLine[4]);
                person.setUrl(nextLine[5]);
                person.setOrgid(nextLine[6]);
                person.setFormid(nextLine[7]);
                person.setLtpa(nextLine[8]);
                person.setSubirresponse(nextLine[9]);

                if (nextLine[11] != null) {
                    try {
                        date = simpleDateFormat.parse(nextLine[11]);
                        person.setYmdh(date);
                    } catch (ParseException e1) {
                        e1.printStackTrace();
                    }
                }
                personRepository.save(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Person> getPersonLastHour() {
        return personDao.getPersonLastHour();
    }

    @Override
    public List<Person> getPersonStartButNotSend() {
        return personDao.getPersonStartButNotSend();
    }

    @Override
    public List<Person> getBest5Form() {
        return personDao.getBest5Form();
    }
}
