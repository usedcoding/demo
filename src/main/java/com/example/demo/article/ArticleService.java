package com.example.demo.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    public void create(String subject, String content) {
        Article article = new Article();
        article.setSubject(subject);
        article.setContent(content);
        article.setCreateDate(LocalDateTime.now());
        this.articleRepository.save(article);

    }
}
