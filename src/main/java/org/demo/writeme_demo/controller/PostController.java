package org.demo.writeme_demo.controller;

import lombok.RequiredArgsConstructor;
import org.demo.writeme_demo.dto.Post;
import org.demo.writeme_demo.service.PostService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {
  private final PostService postService;

  @GetMapping
  public List<Post> getAllPosts() {
    return postService.getAllPosts();
  }

  @GetMapping("/{contentId}")
  public Post getPostByContentId(int contentId) {
    return postService.getPostByContentId(contentId);
  }
}
