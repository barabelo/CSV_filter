package br.com.dominio.service;

import br.com.dominio.model.Jogo;
import br.com.dominio.model.Plataformas;
import br.com.dominio.model.Publishers;

import java.util.List;
import java.util.stream.Collectors;

public class ServiceGame {
    public static List<Jogo> getJogosPorPlataforma(List<Jogo> jogos, Plataformas platforma) {
        List<Jogo> jogosPorPlataforma = jogos.stream().filter((jogo ->
                jogo.getPlatform().equals(platforma.getValorNoCsv()))).collect(Collectors.toList());
        return jogosPorPlataforma;
    }

    public static List<Jogo> getJogosPorPublisher(List<Jogo> jogos, Publishers publisher) {
        List<Jogo> jogosPorPublisher = jogos.stream().filter((jogo ->
                jogo.getPublisher().equals(publisher.getValorNoCsv()))).collect(Collectors.toList());

        return jogosPorPublisher;
    }
}


