package com.SOA.demo.SoaUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SoaUserRepository
        extends JpaRepository<SoaUser, Long> {
    // SELECT * FROM soausers WHERE email = ?
    @Query("SELECT s FROM SoaUser s WHERE s.email = ?1")
    Optional<SoaUser> findSoaUserByEmail(String email);
}
