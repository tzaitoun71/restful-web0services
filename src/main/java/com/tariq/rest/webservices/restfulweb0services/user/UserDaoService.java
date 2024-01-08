package com.tariq.rest.webservices.restfulweb0services.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Tariq", LocalDate.now().minusYears(30)));
        users.add(new User(2, "Talat", LocalDate.now().minusYears(40)));
        users.add(new User(3, "Talal", LocalDate.now().minusYears(35)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
