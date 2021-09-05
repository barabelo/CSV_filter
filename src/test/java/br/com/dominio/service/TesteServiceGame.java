package br.com.dominio.service;

import br.com.dominio.model.Jogo;
import br.com.dominio.model.Plataformas;
import br.com.dominio.model.Publishers;
import br.com.dominio.utils.OperacoesCsv;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TesteServiceGame {
    private static List<Jogo> listaDeJogos;

    @BeforeClass
    public static void inicializarClasse() throws URISyntaxException {
        Path caminho = Paths.get(ClassLoader.getSystemResource("vendas-games.csv").toURI());
        listaDeJogos = OperacoesCsv.lerCsvJogo(caminho);
    }

    @Test
    public void testeGetJogosPs4() {
        List<Jogo> jogosPs4 = ServiceGame.getJogosPorPlataforma(listaDeJogos, Plataformas.PS4);
        Assert.assertEquals(5, jogosPs4.size());
    }

    @Test
    public void testeGetJogosAtari2600() {
        List<Jogo> jogosAtari2600 = ServiceGame.getJogosPorPlataforma(listaDeJogos, Plataformas.ATARI_2600);
        Assert.assertEquals(1, jogosAtari2600.size());
    }

    @Test
    public void testeGetJogosActivision() {
        List<Jogo> jogosActivision = ServiceGame.getJogosPorPublisher(listaDeJogos, Publishers.ACTIVISION);
        Assert.assertEquals(14, jogosActivision.size());
    }

    @Test
    public void testeGetJogosTakeTwoInteractive() {
        List<Jogo> jogosTakeTwoInteractive = ServiceGame.getJogosPorPublisher(listaDeJogos, Publishers.TAKE_TWO_INTERACTIVE);
        Assert.assertEquals(9, jogosTakeTwoInteractive.size());
    }

}
