package com.SOA.demo.user;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserrService {

    public List<Userr> getUserrs() {
        return List.of(new Userr(),
                new Userr("Oscar Vergara",
                        "Oscar.vergara1994@gmail.com"
                )
        );
    }
}
