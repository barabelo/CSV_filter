package br.com.dominio.service;

import br.com.dominio.model.Jogo;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OperacoesCsv {
    public static List<Jogo> lerCsvJogo(Path caminhoCsv) {
        List<Jogo> listaJogos = new ArrayList<>();
        try {
            Reader reader = Files.newBufferedReader(caminhoCsv);
            CsvToBean<Jogo> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Jogo.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            listaJogos = csvToBean.parse();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaJogos;
    }

}
