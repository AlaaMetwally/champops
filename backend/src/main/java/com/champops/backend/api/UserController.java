package com.champops.backend.api;

import com.champops.backend.user.AppUser;
import com.champops.backend.user.AppUserRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final AppUserRepository appUserRepository;

    public UserController(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @GetMapping
    public List<AppUser> getUsers() {
        return appUserRepository.findAll();
    }

    @PostMapping
    public AppUser createUser(@RequestBody AppUser user) {
        return appUserRepository.save(user);
    }
}