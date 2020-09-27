package com.mcs.gateway.microservices.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mcs.gateway.microservices.Model.Person;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

    //init data person sebanyak 2 record
    private List<Person> persons = new ArrayList<Person>(Arrays.asList(
        new Person(1L,"Albert","Einstein",50),
        new Person(2L,"Mona","Liza",30)
    ));

    public List<Person> findAll() { //tampilkan semua data
        return persons;
    }

    public Person findById(Long id) { //tampilakn data berdasarkan id
        return persons.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

    public Person saveNew(Person person) { //simpan data baru
        persons.add(person);
        return person;
    }

    public Person update(Person person, Long id) { //update data berdasarkan id
        int counter = 0;
        for(Person p: persons) {
            if(p.getId().equals(id)) {
                persons.set(counter, person);
            }
            counter++;
        }
        return person;
    }

    public void delete(Long id) { //hapus data
        persons.removeIf(p -> p.getId().equals(id));
    }
    
}
