package com.example.payment.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.example.payment.api.model.User;;

@Service
public class UserService {
    
    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();   

        User user1 = new User(1,"Shrewd","Shrewd@mail.com","test123");
        User user2 = new User(2,"Luni","Luni@mail.com","test321");
        User user3 = new User(3,"Test","Test@mail.com","test456");

        userList.addAll(Arrays.asList(user1,user2,user3));
    }

    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty();
        for (User user: userList) {
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
