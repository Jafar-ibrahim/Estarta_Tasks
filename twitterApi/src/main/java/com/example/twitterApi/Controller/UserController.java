package com.example.twitterApi.Controller;

import com.example.twitterApi.Entity.TweetDto;
import com.example.twitterApi.Exception.UserImpersonatingException;
import com.example.twitterApi.Security.AuthService;
import com.example.twitterApi.Service.TweetService;
import com.example.twitterApi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/twitter")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    TweetService tweetService;
    @Autowired
    AuthService authService;


    @GetMapping("/{userName}")
    @ResponseBody
    public List<TweetDto> getTweets(@PathVariable String userName){
        if(authService.checkUser(userName))
            return userService.getTweets(userName);
        else
            throw new UserImpersonatingException("Error : Trying to modify/access another user's tweets.");
    }

    @PostMapping("/{userName}")
    @ResponseBody
    public TweetDto postTweet(
            @PathVariable String userName ,
            String body
            ){
        if(authService.checkUser(userName))
            return tweetService.postTweet(userName,body);
        else
            throw new UserImpersonatingException("Error : Trying to modify/access another user's tweets.");
    }
}
