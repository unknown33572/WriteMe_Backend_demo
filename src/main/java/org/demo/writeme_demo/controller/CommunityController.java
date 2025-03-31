package org.demo.writeme_demo.controller;

import lombok.RequiredArgsConstructor;
import org.demo.writeme_demo.dto.CommunityBoard;
import org.demo.writeme_demo.service.CommunityService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/community")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class CommunityController {
  private final CommunityService communityService;
  
  @GetMapping
  public List<CommunityBoard> getAllPosts() {
    return communityService.getAllPosts();
  }
}
