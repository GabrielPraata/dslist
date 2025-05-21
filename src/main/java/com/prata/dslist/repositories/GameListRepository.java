package com.prata.dslist.repositories;

import com.prata.dslist.entities.Game;
import com.prata.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
