package com.SOA.demo.SoaUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path="api/v1/soa-user")
public class SoaUserController {
    private final SoaUserService soaUserService;

    @Autowired
    public SoaUserController(SoaUserService SoaUserService) {
        this.soaUserService = SoaUserService;
    }

    @GetMapping("/")
    public List<SoaUser> getSoaUsers() {
        return this.soaUserService.getSoaUsers();
    }

    @PostMapping("/")
    public void registerNewSoaUser(@RequestBody SoaUser soaUser) {
        soaUserService.addNewSoaUser(soaUser);
    }
}
