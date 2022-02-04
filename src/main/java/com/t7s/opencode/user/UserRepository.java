package com.t7s.opencode.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {

    Optional<Users> findUserByUsernameIgnoreCase(String username);

    @Query("SELECT u FROM Users u WHERE u.email = ?1")
    Optional<Users> findUserByEmail(String email);

//    @Query("SELECT u.password FROM Users u WHERE u.username = ?1")
    Users getUserByUsernameIgnoreCase(String username);

    Users getUserByEmailIgnoreCase(String email);

    @Transactional
    @Modifying
    @Query("UPDATE Users u SET u.isEnabled = TRUE WHERE u.email = ?1")
    int enableUser(String email);

    @Transactional
    @Modifying
    @Query("UPDATE Users u SET u.password = ?2 WHERE u.email = ?1")
    int updatePasswordViaEmail(String email, String password);
}
