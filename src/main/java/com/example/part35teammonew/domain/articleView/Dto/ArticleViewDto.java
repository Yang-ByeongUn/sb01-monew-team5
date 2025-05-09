package com.example.part35teammonew.domain.articleView.dto;


import java.util.Set;
import java.util.UUID;

public record ArticleViewDto(
    UUID articleId, Set<UUID> readUserIds
) {

}
