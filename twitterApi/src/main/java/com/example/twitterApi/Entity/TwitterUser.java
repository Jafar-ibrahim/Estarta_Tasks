package com.example.twitterApi.Entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "user_info" , schema = "twitter")
public class TwitterUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" , nullable = false)
    private Long id ;

    @Column(name = "user_name" , nullable = false , unique = true)
    private String userName;

    @Column(name = "password" , nullable = false)
    private String password ;

    // Because this relation is One-to-Many , I made the Many side (Tweet) the
    // owning side , as stated in the JPA specification
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "user")
    private List<Tweet> tweets;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles" ,
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    @OrderColumn(name = "id")
    private Set<Role> roles = new HashSet<>();

    private boolean isEnabled;

    private boolean isCredentialsNonExpired;

    private boolean isAccountNonLocked;

    private boolean isAccountNonExpired;

    public TwitterUser(Long id) {
        this.id = id;
    }
}
