package com.SOA.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/user")
public class UserrController {
    private final UserrService userrService;

    @Autowired
    public UserrController(UserrService userrService) {
        this.userrService = userrService;
    }

    @GetMapping("/")
    public List<Userr> getUserrs() {
        return this.userrService.getUserrs();
    }
}
