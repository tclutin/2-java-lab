package com.example.demo.controller;

import com.example.demo.model.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostsViewController {

    @Autowired
    private PostService postsService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("appName", "Сентябрь горит");
        model.addAttribute("posts", postsService.listAllPosts());
        return "list";
    }

    @ResponseBody
    @RequestMapping(path = "/post/{id}", method = RequestMethod.GET)
    public String single(@PathVariable("id") Long id) {
        return "Скоро будет пост ёпта #" + id;
    }
}


