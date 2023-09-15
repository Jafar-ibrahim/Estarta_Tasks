package com.example.twitterApi.Service;

import com.example.twitterApi.Entity.TweetDto;

import java.util.List;

public interface TweetService {
    TweetDto postTweet(String userName, String body);
}
