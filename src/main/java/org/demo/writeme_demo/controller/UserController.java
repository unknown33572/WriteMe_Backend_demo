package org.demo.writeme_demo.controller;

import lombok.RequiredArgsConstructor;
import org.demo.writeme_demo.dto.User;
import org.demo.writeme_demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
  private final UserService userService;

  @GetMapping("/{id}")
  public ResponseEntity<User> getUserById(@PathVariable int id) {
    return ResponseEntity.ok(userService.getUserById(id));
  }

  @PostMapping
  public ResponseEntity<Void> insertUser(@RequestBody User user) {
    userService.insertUser(user);
    return ResponseEntity.ok().build();
  }
}
