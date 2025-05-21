package com.prata.dslist.controllers;

import com.prata.dslist.dto.GameDTO;
import com.prata.dslist.dto.GameListDTO;
import com.prata.dslist.dto.GameMinDTO;
import com.prata.dslist.services.GameListService;
import com.prata.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.fingAll();
        return result;
    }
}
