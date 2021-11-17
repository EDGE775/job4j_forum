package ru.job4j.forum.service;

import org.springframework.stereotype.Service;
import ru.job4j.forum.model.Post;
import ru.job4j.forum.repository.PostRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post saveOrUpdate(Post post) {
        return postRepository.saveOrUpdate(post);
    }

    public List<Post> getAll() {
        return postRepository.getAll().stream().toList();
    }

    public void deleteById(int id) {
        postRepository.deleteById(id);
    }

    public Optional<Post> findById(int id) {
        Post post = postRepository.findById(id);
        return Optional.ofNullable(post);
    }
}