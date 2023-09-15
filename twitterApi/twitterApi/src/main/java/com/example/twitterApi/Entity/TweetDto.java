package com.example.twitterApi.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TweetDto {
    String userName;
    String body;

    public TweetDto(Tweet tweet) {
        this.userName = tweet.getUser().getUserName();
        this.body = tweet.getBody();
    }

}
