package org.demo.writeme_demo.service;

import lombok.RequiredArgsConstructor;
import org.demo.writeme_demo.dao.PostMapper;
import org.demo.writeme_demo.dto.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
  private final PostMapper postMapper;

  public List<Post> getAllPosts() {
    return postMapper.selectAllPosts();
  }

  public Post getPostByContentId(int contentId) {
    return postMapper.selectPostByContentId(contentId);
  }
}
