package com.example.twitterApi.Entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Entity
@Table(name = "tweet" , schema = "twitter" )
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Tweet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "body" , nullable = false)
    private String body;

    // Because this relation is One-to-Many , I made the Many side (Tweet) the
    // owning side , as stated in the JPA specification
    @ManyToOne
    @JoinColumn(name = "tweetedBy" ,referencedColumnName = "user_name"
            , nullable =false , unique = true)
    private TwitterUser user;

    public Tweet(String body, TwitterUser user) {
        this.body = body;
        this.user = user;
    }
}
