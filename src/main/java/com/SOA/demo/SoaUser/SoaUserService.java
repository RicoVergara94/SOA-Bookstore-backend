package com.SOA.demo.SoaUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SoaUserService {

    private final SoaUserRepository soaUserRepository;

    @Autowired
    public SoaUserService(SoaUserRepository soaUserRepository) {
        this.soaUserRepository = soaUserRepository;
    }

    public List<SoaUser> getSoaUsers() {
        return soaUserRepository.findAll();
    }
    public void addNewSoaUser(SoaUser soaUser) {
        Optional<SoaUser> soaUserOptional = soaUserRepository
                .findSoaUserByEmail(soaUser.getEmail());
        if(soaUserOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        soaUserRepository.save(soaUser);
    }
}
