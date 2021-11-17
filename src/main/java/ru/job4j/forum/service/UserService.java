package ru.job4j.forum.service;

import org.springframework.stereotype.Service;
import ru.job4j.forum.model.Authority;
import ru.job4j.forum.model.User;
import ru.job4j.forum.repository.AuthorityRepository;
import ru.job4j.forum.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final AuthorityRepository authorityRepository;

    public UserService(UserRepository userRepository,
                       AuthorityRepository authorityRepository) {
        this.userRepository = userRepository;
        this.authorityRepository = authorityRepository;
    }

    public Authority findByAuthorityName(String name) {
        return authorityRepository.findByAuthority(name);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findUserByName(String name) {
        return userRepository.findByUsername(name);
    }
}
