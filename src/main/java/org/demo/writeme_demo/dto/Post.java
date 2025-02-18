package org.demo.writeme_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
  private int contentId;
  private int userId;
  private String name;
  private String title;
  private String content;
  private LocalDateTime writeDate;
  private int viewCount;
}
