package com.prata.dslist.services;

import com.prata.dslist.dto.GameMinDTO;
import com.prata.dslist.entities.Game;
import com.prata.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public List<GameMinDTO> fingAll(){
       List<Game> result = gameRepository.findAll();
        return  result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
