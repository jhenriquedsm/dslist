package com.jhenriquedsm.dslist.services;

import com.jhenriquedsm.dslist.dto.GameMinDTO;
import com.jhenriquedsm.dslist.entities.Game;
import com.jhenriquedsm.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
