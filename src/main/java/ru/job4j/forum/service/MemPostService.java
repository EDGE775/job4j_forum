package ru.job4j.forum.service;

import org.springframework.stereotype.Service;
import ru.job4j.forum.model.Post;
import ru.job4j.forum.repository.MemPostRepository;

import java.util.List;
import java.util.Optional;

public class MemPostService implements PostServiceInterface {

    private final MemPostRepository memPostRepository;

    public MemPostService(MemPostRepository memPostRepository) {
        this.memPostRepository = memPostRepository;
    }

    @Override
    public Post saveOrUpdate(Post post) {
        return memPostRepository.saveOrUpdate(post);
    }

    @Override
    public List<Post> getAll() {
        return memPostRepository.getAll().stream().toList();
    }

    @Override
    public void deleteById(int id) {
        memPostRepository.deleteById(id);
    }

    @Override
    public Optional<Post> findById(int id) {
        Post post = memPostRepository.findById(id);
        return Optional.ofNullable(post);
    }
}