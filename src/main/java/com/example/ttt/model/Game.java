// src/main/java/com/example/ttt/model/Game.java
package com.example.ttt.model;
import javax.persistence.*;
@Entity
public class Game {
  @Id @GeneratedValue
  private Long id;
  private String board; // e.g. "---------"
  private String status;
}