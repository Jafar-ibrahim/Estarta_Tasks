package com.example.twitterApi.Service;

import com.example.twitterApi.Entity.Tweet;
import com.example.twitterApi.Entity.TweetDto;
import com.example.twitterApi.Entity.TwitterUser;
import com.example.twitterApi.Repository.TweetRepo;
import com.example.twitterApi.Repository.UserRepo;
import com.example.twitterApi.Security.AuthService;
import com.example.twitterApi.Security.TwitterUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService , UserDetailsService {

    @Autowired
    UserRepo userRepo;
    @Autowired
    PasswordEncoder passwordEncoder;


    @Override
    public List<TweetDto> getTweets(String userName)  {
        TwitterUser user = this.findByUserName(userName);

        if (user == null) {
            throw new UsernameNotFoundException("This User Not found with selected user name :- " + userName);
        }
        List<Tweet> tweets = user.getTweets();
        List<TweetDto> tweetsDto = tweets.stream()
                .map(tweet ->
                        new TweetDto(tweet))
                .collect(Collectors.toList());
        return tweetsDto;
    }

    @Override
    public TwitterUser findByUserName(String userName) {
        return userRepo.findByUserName(userName).orElse(null);
    }

    public TwitterUser save(TwitterUser entity) {
        entity.setPassword(passwordEncoder.encode(entity.getPassword()));
        return userRepo.save(entity);
    }

    public List<TwitterUser> findAll (){
        return userRepo.findAll();
    }

    public TwitterUser findById (Long id){
        return userRepo.findById(id).orElse(null);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<TwitterUser> appUser =	userRepo.findByUserName(username);

        if (!appUser.isPresent()) {

            throw new UsernameNotFoundException("This User Not found with selected user name :- " + username);
        }

        return new TwitterUserDetail(appUser.get());
    }
}
