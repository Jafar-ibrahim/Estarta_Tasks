package com.example.twitterApi.Repository;

import com.example.twitterApi.Entity.TwitterUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<TwitterUser,Long> {
    Optional<TwitterUser> findByUserName(String userName);
}
