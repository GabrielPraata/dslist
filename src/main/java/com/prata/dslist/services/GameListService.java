package com.prata.dslist.services;

import com.prata.dslist.dto.GameDTO;
import com.prata.dslist.dto.GameListDTO;
import com.prata.dslist.dto.GameMinDTO;
import com.prata.dslist.entities.Game;
import com.prata.dslist.entities.GameList;
import com.prata.dslist.repositories.GameListRepository;
import com.prata.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> fingAll(){
       List<GameList> result = gameListRepository.findAll();
        return  result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
