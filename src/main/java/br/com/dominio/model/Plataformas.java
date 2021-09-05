package br.com.dominio.model;

import lombok.Getter;

public enum Plataformas {
    WII("Wii"),
    NES("NES"),
    GB("GB"),
    DS("DS"),
    X360("X360"),
    PS2("PS2"),
    GBA("GBA"),
    PS4("PS4"),
    PS3("PS3"),
    NINTENDO_3DS("3DS"),
    N64("N64"),
    PS("PS"),
    SNES("SNES"),
    XB("XB"),
    PC("PC"),
    ATARI_2600("2600"),
    PSP("PSP");

    @Getter
    private final String valorNoCsv;

    Plataformas(String valorNoCsv) {
        this.valorNoCsv = valorNoCsv;
    }
}
