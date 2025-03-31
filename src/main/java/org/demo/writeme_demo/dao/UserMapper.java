package org.demo.writeme_demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.demo.writeme_demo.dto.User;

@Mapper
public interface UserMapper {
  @Select("SELECT * FROM users WHERE id = #{id}")
  User selectUserById(int id);

  @Insert("""
          INSERT INTO users (id, user_id, password, nickname, email, phone, is_admin)
          VALUES (#{id}, #{user_id}, #{password}, #{nickname}, #{email}, #{phone}, #{is_admin})
          """)
  @Options(useGeneratedKeys = true, keyProperty = "id")
  int insertUser(User user);
}
