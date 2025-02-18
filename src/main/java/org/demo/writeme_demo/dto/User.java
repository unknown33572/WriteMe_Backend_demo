package org.demo.writeme_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
  private int id;
  private String name;
  private String userId;
  private String pwd;
  private String email;
  private String phone;
  private String gender;
}
