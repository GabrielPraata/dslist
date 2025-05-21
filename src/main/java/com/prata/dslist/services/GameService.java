package com.prata.dslist.services;

import com.prata.dslist.dto.GameDTO;
import com.prata.dslist.dto.GameMinDTO;
import com.prata.dslist.entities.Game;
import com.prata.dslist.projections.GameMinProjection;
import com.prata.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> fingAll(){
       List<Game> result = gameRepository.findAll();
        return  result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> fingByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return  result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
