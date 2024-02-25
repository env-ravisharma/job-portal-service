package com.env.jobPortalService.post.controller;

import com.env.jobPortalService.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PostController {

    @Autowired
    PostService postService;

    public void get() {
        postService.get();
    }

    public void addPost(){
        postService.add();
    }

    public void update() {
        postService.update();
    }

    public void delete() {
        postService.delete();
    }



}
