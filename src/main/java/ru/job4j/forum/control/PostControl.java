package ru.job4j.forum.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.job4j.forum.model.Post;
import ru.job4j.forum.service.PostServiceInterface;

@Controller
public class PostControl {
    private final PostServiceInterface postService;

    public PostControl(PostServiceInterface postService) {
        this.postService = postService;
    }

    @GetMapping("/discuss")
    public String discuss(@RequestParam("id") int id, Model model) {
        Post post = postService.findById(id).get();
        model.addAttribute("post", post);
        return "post/post";
    }

    @GetMapping("/create")
    public String create(Post post) {
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
        int id = post.getId();
        if (id != 0) {
            post.setId(id);
        }
        postService.saveOrUpdate(post);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id) {
        postService.deleteById(id);
        return "redirect:/";
    }
}
