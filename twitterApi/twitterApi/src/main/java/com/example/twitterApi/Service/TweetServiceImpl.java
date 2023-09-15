package com.example.twitterApi.Service;

import com.example.twitterApi.Entity.Tweet;
import com.example.twitterApi.Entity.TweetDto;
import com.example.twitterApi.Entity.TwitterUser;
import com.example.twitterApi.Repository.TweetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TweetServiceImpl implements TweetService{

    @Autowired
    TweetRepo tweetRepo;
    @Autowired
    UserService userService;


    @Override
    public TweetDto postTweet(String userName, String body)  {

        TwitterUser user = userService.findByUserName(userName);

        if (user == null) {
            throw new UsernameNotFoundException("This User Not found with selected user name :- " + userName);
        }

        Tweet tweet = new Tweet(body,user);
        return new TweetDto(tweetRepo.save(tweet));
    }
}
