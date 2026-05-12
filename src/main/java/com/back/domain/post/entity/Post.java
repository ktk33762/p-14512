package com.back.domain.post.entity;

import com.back.domain.member.entity.Member;
import com.back.global.baseEntity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Post extends BaseEntity {
    private String title;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member author;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Post(Member author, String title, String content) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void modify(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
