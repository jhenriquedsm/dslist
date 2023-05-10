package com.jhenriquedsm.dslist.repositories;

import com.jhenriquedsm.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository <GameList, Long> {

}
