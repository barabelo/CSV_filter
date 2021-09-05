package br.com.dominio.model;

import lombok.Getter;

public enum Publishers {
    NINTENDO("Nintendo"),
    MICROSOFT_GAME_STUDIOS("Microsoft Game Studios"),
    TAKE_TWO_INTERACTIVE("Take-Two Interactive"),
    SONY_COMPUTER_ENTERTAINMENT("Sony Computer Entertainment"),
    ACTIVISION("Activision"),
    UBISOFT("Ubisoft"),
    BETHESDA_SOFTWORKS("Bethesda Softworks"),
    ELECTRONIC_ARTS("Electronic Arts"),
    SEGA("Sega"),
    ATARI("Atari");

    @Getter
    private final String valorNoCsv;

    Publishers(String valorNoCsv) {
        this.valorNoCsv = valorNoCsv;
    }
}
