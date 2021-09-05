package br.com.dominio.principal;

import br.com.dominio.model.Jogo;
import br.com.dominio.model.Plataformas;
import br.com.dominio.model.Publishers;
import br.com.dominio.service.ServiceGame;
import br.com.dominio.utils.OperacoesCsv;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path caminho = null;
        try {
            caminho = Paths.get(ClassLoader.getSystemResource("vendas-games.csv").toURI());
        } catch (URISyntaxException e) {
            System.out.println("Houve um erro na abertura do CSV." + e.getMessage());
        }
        List<Jogo> todosOsJogos = OperacoesCsv.lerCsvJogo(caminho);
        List<Jogo> jogosPs4 = ServiceGame.getJogosPorPlataforma(todosOsJogos, Plataformas.PS4);
        List<Jogo> jogosActivision = ServiceGame.getJogosPorPublisher(todosOsJogos, Publishers.ACTIVISION);
    }
}
