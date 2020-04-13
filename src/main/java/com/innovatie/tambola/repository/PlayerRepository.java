package com.innovatie.tambola.repository;

import com.innovatie.tambola.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
