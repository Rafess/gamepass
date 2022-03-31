package com.rafesgames.gamepass.controller;
import com.rafesgames.gamepass.dto.GameRequest;
import com.rafesgames.gamepass.dto.GameResponse;
import com.rafesgames.gamepass.model.Game;
import com.rafesgames.gamepass.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/game")
public class GameController {
    @Autowired
    GameService gameService;

    @PostMapping
    public ResponseEntity<GameResponse> registerGame(@RequestBody @Valid GameRequest gameRequest,
                                     UriComponentsBuilder uriComponentsBuilder) {
        Game game = gameService.register(gameRequest);

        URI uri = uriComponentsBuilder.path("/game/{id}").buildAndExpand(game.getId()).toUri();
        return ResponseEntity.created(uri).body(new GameResponse(game));
    }
    @GetMapping
    public Game getGame(){
        return new Game(UUID.randomUUID(), "Ruined King", "single-player", "RPG");
    }
}
