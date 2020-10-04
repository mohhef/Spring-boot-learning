package com.in28minutes.database.databasedemo.jdbc;

import com.in28minutes.database.databasedemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class PersonJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;


    class PersonRowMapper implements RowMapper<Person>{
        @Override
        public Person mapRow(ResultSet resultSet, int i) throws SQLException {
            Person person = new Person();
            person.setId(resultSet.getInt("id"));
            person.setName(resultSet.getString("name"));
            person.setLocation(resultSet.getString("location"));
            person.setBirthdate(resultSet.getDate("birth_date"));
        }
    }
    public List<Person> findAll(){
        return  jdbcTemplate.query("Select * from person", new PersonRowMapper());
    }

//    public Person findById(int id) {
//        return jdbcTemplate.queryForObject("select * from person where id=?", new Object[] { id },
//                (rs,rowNum)->new Person(rs.getInt("id"),rs.getString("name"),
//                        rs.getString("location"),rs.getDate("birthdate")
//                        ));
//    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject
                ("select * from person where id=?", new Object[] { id },
                        new BeanPropertyRowMapper<Person>(Person.class));
    }

    public int deleteById(int id){
        return jdbcTemplate.update("delete from person where id=?", new Object[] {id});
    }

    public int insert(Person person){
        return jdbcTemplate.update("insert into person values(?,?,?,?)", new Object[]{person.getId(), person.getName(),
                person.getLocation(), person.getBirthdate()});
    }

    public int update(Person person){
        return jdbcTemplate.update("update person set name=?, location=?, birthdate=? where id=?",
                new Object[]{ person.getName(),
                person.getLocation(), person.getBirthdate(),person.getId()});
    }
}
