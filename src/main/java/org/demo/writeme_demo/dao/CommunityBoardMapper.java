package org.demo.writeme_demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.demo.writeme_demo.dto.CommunityBoard;

import java.util.List;

@Mapper
public interface CommunityBoardMapper {
  @Select("SELECT id, user_id, title, create_time, edit_time, is_edited, view_count, like_count, comment_count FROM comm_boards")
  List<CommunityBoard> selectAllPosts();
}
