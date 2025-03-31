package org.demo.writeme_demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.demo.writeme_demo.dto.NoticeBoard;

import java.util.List;

@Mapper
public interface NoticeBoardMapper {
  @Select("SELECT id, user_id, title, create_time, edit_time, is_edited, view_count FROM noti_boards")
  List<NoticeBoard> selectAllPosts();

  @Select("SELECT id, user_id, title, contents, create_time, edit_time, is_edited, view_count FROM noti_boards WHERE id = #{id}")
  NoticeBoard selectPostByContentId(int id);
}
