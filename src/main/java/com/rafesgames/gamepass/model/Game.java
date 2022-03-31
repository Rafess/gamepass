package com.rafesgames.gamepass.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Game {
    public UUID id;
    public String name;
    public String type;
    public String gender;
}
