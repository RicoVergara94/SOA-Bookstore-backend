package com.SOA.demo.SoaUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/user")
public class SoaUserController {
    private final SoaUserService SoaUserService;

    @Autowired
    public SoaUserController(SoaUserService SoaUserService) {
        this.SoaUserService = SoaUserService;
    }

    @GetMapping("/")
    public List<SoaUser> getSoaUsers() {
        return this.SoaUserService.getSoaUsers();
    }
}
