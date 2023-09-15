package com.example.twitterApi.Service;

import com.example.twitterApi.Entity.TweetDto;
import com.example.twitterApi.Entity.TwitterUser;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;


public interface UserService extends UserDetailsService {

    List<TweetDto> getTweets(String userName) ;
    TwitterUser findByUserName(String userName);
    TwitterUser save(TwitterUser entity);
    List<TwitterUser> findAll();
}
