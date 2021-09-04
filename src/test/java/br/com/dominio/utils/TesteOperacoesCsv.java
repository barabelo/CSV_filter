package br.com.dominio.utils;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import br.com.dominio.model.Jogo;

public class TesteOperacoesCsv {

    private static List<Jogo> listaDeJogos;

    @BeforeClass
    public static void inicializarClasse() throws URISyntaxException {
        Path caminho = Paths.get(ClassLoader.getSystemResource("vendas-games.csv").toURI());
        listaDeJogos = OperacoesCsv.lerCsvJogo(caminho);
    }

    @Test
    public void testarNumeroDeLinhas(){
        int numLines = listaDeJogos.size();
        Assert.assertEquals(100,numLines);
    }
}
