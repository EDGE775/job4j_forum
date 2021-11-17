package ru.job4j.forum.service;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.job4j.forum.model.Post;
import ru.job4j.forum.repository.PostRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService implements PostServiceInterface {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post saveOrUpdate(Post post) {
        return postRepository.save(post);
    }

    @Override
    public List<Post> getAll() {
        List<Post> posts = new ArrayList<>();
        postRepository.findAll(Sort.by("id").ascending())
        .forEach(posts::add);
        return posts;
    }

    @Override
    public void deleteById(int id) {
        postRepository.deleteById(id);
    }

    @Override
    public Optional<Post> findById(int id) {
        return postRepository.findById(id);
    }
}
