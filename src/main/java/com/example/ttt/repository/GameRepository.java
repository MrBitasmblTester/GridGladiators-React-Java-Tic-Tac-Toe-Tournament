// src/main/java/com/example/ttt/repository/GameRepository.java
package com.example.ttt.repository;
import com.example.ttt.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
public interface GameRepository extends JpaRepository<Game,Long> {}