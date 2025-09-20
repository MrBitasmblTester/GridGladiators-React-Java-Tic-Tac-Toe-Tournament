// src/main/java/com/example/ttt/config/WebSocketConfig.java
package com.example.ttt.config;
import org.springframework.context.annotation.*;
import org.springframework.web.socket.config.annotation.*;
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
  public void registerWebSocketHandlers(WebSocketHandlerRegistry r) {
    r.addHandler(new com.example.ttt.handler.GameWebSocketHandler(),"/ws");
  }
}