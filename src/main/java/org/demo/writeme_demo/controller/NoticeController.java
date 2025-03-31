package org.demo.writeme_demo.controller;

import lombok.RequiredArgsConstructor;
import org.demo.writeme_demo.dto.NoticeBoard;
import org.demo.writeme_demo.service.NoticeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notice")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class NoticeController {
  private final NoticeService noticeService;

  @GetMapping
  public List<NoticeBoard> getAllPosts() {
    return noticeService.getAllPosts();
  }

  @GetMapping("/{contentId}")
  public NoticeBoard getPostByContentId(@PathVariable int contentId) {
    return noticeService.getPostByContentId(contentId);
  }
}
