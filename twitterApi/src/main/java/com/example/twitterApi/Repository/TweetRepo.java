package com.example.twitterApi.Repository;

import com.example.twitterApi.Entity.Tweet;
import com.example.twitterApi.Entity.TwitterUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TweetRepo extends JpaRepository<Tweet,Long> {

    List<Tweet> findByUser (TwitterUser user);
}
