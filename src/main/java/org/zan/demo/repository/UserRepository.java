package org.zan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.zan.demo.entity.User;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {


    Optional<User> findByUsername(String username);
    Optional<User> findByApiKey(String apiKey);
}