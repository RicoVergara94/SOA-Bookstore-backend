package com.SOA.demo.SoaUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SoaUserService {

    private final SoaUserRepository soaUserRepository;

    @Autowired
    public SoaUserService(SoaUserRepository soaUserRepository) {
        this.soaUserRepository = soaUserRepository;
    }

    public List<SoaUser> getSoaUsers() {
        return List.of(new SoaUser(),
                new SoaUser("Oscar Vergara",
                        "Oscar.vergara1994@gmail.com"
                )
        );
    }
}