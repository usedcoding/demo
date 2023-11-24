package com.example.demo.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@RequiredArgsConstructor
@Controller
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping("/")
    public String root() {
        return "redirect:/article/list";
    }

    @GetMapping("/article/list")
    public String list() {
        return "article_list";
    }

    @GetMapping("/article/create")
    public String create() {
        return "article_create";
    }

    @PostMapping(value = "/article/create")
    public String create(@RequestParam String subject, @RequestParam String content) {
        this.articleService.create(subject, content);
        return"redirect:/article/list";
    }

    @GetMapping("/article/detail/{id}")
    public String detail() {
        return"";
    }

}
