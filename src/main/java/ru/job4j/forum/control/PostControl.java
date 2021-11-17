package ru.job4j.forum.control;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.job4j.forum.model.Post;
import ru.job4j.forum.model.User;
import ru.job4j.forum.service.PostServiceInterface;
import ru.job4j.forum.service.UserService;

import java.util.Optional;

@Controller
public class PostControl {
    private final PostServiceInterface postService;

    private final UserService userService;

    public PostControl(PostServiceInterface postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping("/discuss")
    public String discuss(@RequestParam("id") int id, Model model) {
        Optional<Post> postOptional = postService.findById(id);
        if (postOptional.isEmpty()) {
            throw new IllegalArgumentException("Поста с таким id не существует!");
        }
        Post post = postOptional.get();
        model.addAttribute("post", post);
        model.addAttribute("user", SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal());
        return "post/post";
    }

    @GetMapping("/create")
    public String create(Model model, Post post) {
        model.addAttribute("user", SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal());
        return "post/edit";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") int id, Model model) {
        model.addAttribute("post",
                postService.findById(id).get());
        return "post/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Post post) {
        UserDetails details = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();
        User user = userService.findUserByName(details.getUsername());
        post.setUser(user);
        postService.saveOrUpdate(post);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id) {
        postService.deleteById(id);
        return "redirect:/";
    }
}
