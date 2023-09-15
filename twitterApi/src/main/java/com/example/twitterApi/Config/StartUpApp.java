package com.example.twitterApi.Config;

import com.example.twitterApi.Entity.Role;
import com.example.twitterApi.Entity.TwitterUser;
import com.example.twitterApi.Service.RoleService;
import com.example.twitterApi.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class StartUpApp implements CommandLineRunner {

	private final UserService userService;
	private final RoleService roleService;

	@Override
	public void run(String... args) throws Exception {


		if (roleService.findAll().isEmpty()) {
			roleService.save(new Role(null, "admin"));
			roleService.save(new Role(null, "user"));
			roleService.save(new Role(null, "employee"));
		}

		Set<Role> adminRoles = new HashSet<>();
		adminRoles.add(roleService.findByName("admin"));

		Set<Role> userRoles = new HashSet<>();
		userRoles.add(roleService.findByName("user"));

		Set<Role>  empRoles = new HashSet<>();
		empRoles.add(roleService.findByName("employee"));

		if (userService.findAll().isEmpty()) {
			userService.save(new TwitterUser(null, "jafar", "123", null,adminRoles,true,true,true,true));
			userService.save(new TwitterUser(null, "abood", "123", null,userRoles,true,true,true,true));
			userService.save(new TwitterUser(null, "test", "123", null,empRoles,true,true,true,true));
		}


	}
}
