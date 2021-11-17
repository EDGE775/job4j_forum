package ru.job4j.forum.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.job4j.forum.model.Post;

public interface PostRepository extends PagingAndSortingRepository<Post, Integer> {
}
