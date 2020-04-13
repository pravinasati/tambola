package com.innovatie.tambola.repository;

import com.innovatie.tambola.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
