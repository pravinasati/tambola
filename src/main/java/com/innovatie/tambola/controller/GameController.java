package com.innovatie.tambola.controller;

import com.innovatie.tambola.service.GameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class GameController {

  private final GameService gameService;

  @Autowired
  public GameController(GameService gameService) {

    this.gameService = gameService;
  }

  @PostMapping("/newGame")
  public Integer newGame() {
    return null;
  }
}
