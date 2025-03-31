package org.demo.writeme_demo.service;

import lombok.RequiredArgsConstructor;
import org.demo.writeme_demo.dao.NoticeBoardMapper;
import org.demo.writeme_demo.dto.NoticeBoard;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeService {
  private final NoticeBoardMapper noticeBoardMapper;

  public List<NoticeBoard> getAllPosts() {
    return noticeBoardMapper.selectAllPosts();
  }

  public NoticeBoard getPostByContentId(int contentsId) {
    return noticeBoardMapper.selectPostByContentId(contentsId);
  }
}
