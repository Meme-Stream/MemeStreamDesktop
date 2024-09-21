package com.memestream.desktop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Meme {

    private UUID id;

    private String title;

    private String description;

    private MemeType type;

    private Chef chef;

    private int likes;
}
