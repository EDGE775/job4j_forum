package ru.job4j.forum.service;

import ru.job4j.forum.model.Post;

import java.util.List;
import java.util.Optional;

public interface PostServiceInterface {
    Post saveOrUpdate(Post post);

    List<Post> getAll();

    void deleteById(int id);

    Optional<Post> findById(int id);
}
