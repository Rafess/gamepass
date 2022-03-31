package com.rafesgames.gamepass.service;

import com.rafesgames.gamepass.dto.GameRequest;
import com.rafesgames.gamepass.model.Game;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GameService {
    public Game register(GameRequest gameRequest) {
        return new Game(
                UUID.randomUUID(),
                gameRequest.getName(),
                gameRequest.getType(),
                gameRequest.getGender()
        );
    }
}
