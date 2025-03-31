package org.demo.writeme_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoticeBoard {
  private int id;
  private int userId;
  private String title;
  private String contents;
  private LocalDateTime createTime;
  private LocalDateTime editTime;
  private boolean isEdited;
  private int viewCount;
}
