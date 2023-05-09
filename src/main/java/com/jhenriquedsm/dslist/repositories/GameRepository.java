package com.jhenriquedsm.dslist.repositories;

import com.jhenriquedsm.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Game, Long> {

}
