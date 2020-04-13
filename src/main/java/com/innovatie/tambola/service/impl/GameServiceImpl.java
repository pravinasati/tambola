package com.innovatie.tambola.service.impl;

import com.innovatie.tambola.entity.Game;
import com.innovatie.tambola.repository.GameRepository;
import com.innovatie.tambola.repository.GameRuleMetadataRepository;
import com.innovatie.tambola.repository.PlayerRepository;
import com.innovatie.tambola.service.GameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GameServiceImpl implements GameService {

  private final GameRepository gameRepository;

  private final GameRuleMetadataRepository ruleMetadataRepository;

  private final PlayerRepository playerRepository;

  @Autowired
  public GameServiceImpl(GameRepository gameRepository,
      GameRuleMetadataRepository ruleMetadataRepository, PlayerRepository playerRepository) {

    this.gameRepository = gameRepository;
    this.ruleMetadataRepository = ruleMetadataRepository;
    this.playerRepository = playerRepository;
  }

  @Override
  public Game startNewGame(Game game) {

    return null;
  }
}
