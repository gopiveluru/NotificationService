package com.thinkConstructive.postservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/posts")
public class PostController {

    @GetMapping("/")
    public String welcomeToUser(Principal principal)
    {
        return "Welcome "+principal.getName()+"to Post Service";
    }

    @GetMapping(value = "{postId}")
    public Posts getPosts(@PathVariable("postId") String postId)
    {
        Posts posts = new Posts("1","post description"+postId);
        return posts;
    }
}
