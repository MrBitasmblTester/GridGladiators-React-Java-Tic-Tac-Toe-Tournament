// src/main/java/com/example/ttt/controller/GameController.java
package com.example.ttt.controller;
import org.springframework.web.bind.annotation.*;
import com.example.ttt.model.Game;
import com.example.ttt.repository.GameRepository;
@RestController
@RequestMapping("/games")
public class GameController {
  private final GameRepository repo;
  public GameController(GameRepository repo){this.repo=repo;}
  @PostMapping public Game newGame(){ return repo.save(new Game()); }
  @GetMapping("/{id}") public Game getGame(@PathVariable Long id){ return repo.findById(id).orElseThrow(); }
}