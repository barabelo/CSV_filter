package br.com.dominio.model;
import lombok.Data;

@Data
public class Jogo {
    private int rank;
    private String name;
    private String platform;
    private int year;
    private String genre;
    private String publisher;
    private float na_sales;
    private float eu_sales;
    private float jp_sales;
    private float other_sales;
    private float global_sales;
}
