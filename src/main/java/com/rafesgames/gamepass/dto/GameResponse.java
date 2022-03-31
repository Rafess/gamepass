package com.rafesgames.gamepass.dto;

import com.rafesgames.gamepass.model.Game;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class GameResponse {
    public UUID id;
    public String name;
    public String type;
    public String gender;

    public GameResponse(Game game) {
        this.id = game.getId();
        this.name = game.getName();
        this.type = game.getType();
        this.gender = game.getGender();
    }
}
