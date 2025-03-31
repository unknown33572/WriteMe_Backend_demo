package org.demo.writeme_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommunityBoard {
   private int id;
   private String userId;
   private String title;
   private String contents;
   private LocalDateTime createTime;
   private LocalDateTime editTime;
   private String viewCount;
   private String likeCount;
   private String commentCount;
}
