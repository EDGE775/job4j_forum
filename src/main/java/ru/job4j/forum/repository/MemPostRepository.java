package ru.job4j.forum.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.forum.model.Post;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MemPostRepository {

    private static final AtomicInteger POST_ID = new AtomicInteger(0);

    private final Map<Integer, Post> posts = new ConcurrentHashMap<>();

    public MemPostRepository() {
        this.saveOrUpdate(Post.of("Продаю машину", "Состояние отличное!"));
        this.saveOrUpdate(Post.of("Ищу собаку. Кличка пёс", "Помогите найти собаку!"));
    }

    public Post saveOrUpdate(Post post) {
        if (post.getId() == 0) {
            post.setId(POST_ID.incrementAndGet());
        }
        posts.put(post.getId(), post);
        return post;
    }

    public Collection<Post> getAll() {
        return posts.values();
    }

    public void deleteById(int id) {
        posts.remove(id);
    }

    public Post findById(int id) {
        return posts.get(id);
    }
}
