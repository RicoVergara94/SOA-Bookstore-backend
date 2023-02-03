package com.SOA.demo.SoaUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoaUserRepository
        extends JpaRepository<SoaUser, Long> {
}
