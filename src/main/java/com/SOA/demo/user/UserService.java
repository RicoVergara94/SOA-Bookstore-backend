package com.SOA.demo.user;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    public List<User> getUsers() {
        return List.of(new User(),
                new User("Oscar Vergara",
                        "Oscar.vergara1994@gmail.com"
                )
        );
    }
}
