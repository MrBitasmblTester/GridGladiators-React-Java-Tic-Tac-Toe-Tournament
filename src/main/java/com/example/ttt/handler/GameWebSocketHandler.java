// src/main/java/com/example/ttt/handler/GameWebSocketHandler.java
package com.example.ttt.handler;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.TextWebSocketHandler;
public class GameWebSocketHandler extends TextWebSocketHandler {
  @Override public void handleTextMessage(WebSocketSession s, TextMessage m){}
}