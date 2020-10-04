package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {

    private static int userCounter = 3;

    static final List<User> users = new ArrayList<>();

    static{
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "Eve", new Date()));
        users.add(new User(3, "Jack", new Date()));
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User user) {
        if(user.getId()==null){
            user.setId(++userCounter);
        }
        users.add(user);
        return user;
    }

    public User find(int id){
        for(User user: users){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    public User deleteById(int id){
        User user = find(id);
        users.remove(user);
        if(user==null){
            return null;
        }
        return user;
    }
}
