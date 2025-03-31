package org.demo.writeme_demo.service;

import lombok.RequiredArgsConstructor;
import org.demo.writeme_demo.dao.CommunityBoardMapper;
import org.demo.writeme_demo.dto.CommunityBoard;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommunityService {
  private final CommunityBoardMapper communityBoardMapper;
  public List<CommunityBoard> getAllPosts() {
    return communityBoardMapper.selectAllPosts();
  }
}
