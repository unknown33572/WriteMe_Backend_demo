package org.demo.writeme_demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.demo.writeme_demo.dto.Post;

import java.util.List;

@Mapper
public interface PostMapper {
  @Select("SELECT content_id, user_id, name, title, write_date, view_count FROM posts")
  List<Post> selectAllPosts();

  @Select("SELECT content_id, user_id, name, title, contents, write_date, view_count FROM posts WHERE content_id = #{contentId}")
  Post selectPostByContentId(int contentId);
}
