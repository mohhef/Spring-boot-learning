package com.in28minutes.database.databasedemo.jpa;

import com.in28minutes.database.databasedemo.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class PersonJpaRepository {

    //Connect to the database
    @PersistenceContext
    EntityManager e;

    public Person findById(int id){
        return e.find(Person.class, id);
    }

    public Person update(Person person){
        return e.merge(person);
    }

    public Person insert(Person person){
        return e.merge(person);
    }

    public void delete(int id){
        Person person = findById(id);
        e.remove(person);
    }

    public List<Person> findAll(){
        TypedQuery<Person> namedQuery= e.createNamedQuery("find_all_persons", Person.class);
        return namedQuery.getResultList();
    }
}
