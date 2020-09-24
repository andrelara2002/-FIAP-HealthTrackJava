package br.com.fiap.healthtrack;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.sql.DataSource;

public class ResumoDAO {

    String[] resumo = new String[10];
    private DataSource ds;
    private String esportePrincipal;//Pos [6]
    private String meta;//Pos [5]
    private int kcal;//Pos [4]
    private double altura;//Pos [3]
    private int imc;//Pos [2]
    private int peso; //Pos [1]
    private int passos;//Pos [0]
    private int anosPratica;//pos [7]
    private int dataPeso;//Pos [8]
    private int coposAgua;//pos [9]

    ResumoDAO(){}

    public void setDataSource(DataSource ds) {
        this.ds = ds;
    }

    public String getEsportePrincipal() {
        return resumo[6];
    }

    public void setEsportePrincipal(String esportePrincipal) {
        this.esportePrincipal = esportePrincipal;
        resumo[6] = this.esportePrincipal;
    }

    public String getMeta() {
        return resumo[5];
    }

    public void setMeta(String meta) {
        this.meta = meta;
        resumo[5] = this.meta;
    }

    public int getKcal() {
        return Integer.parseInt(resumo[4]);
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
        resumo[4] = String.valueOf(this.kcal);
    }

    public double getAltura() {
        return Double.parseDouble(resumo[3]);
    }

    public void setAltura(double altura) {
        this.altura = altura;
        resumo[3] = String.valueOf(this.altura);
    }

    public int getImc() {
        return Integer.parseInt(resumo[2]);
    }

    public void setImc(int imc) {
        this.imc = imc;
        resumo[2] = String.valueOf(this.imc);
    }

    public int getPeso() {
        return Integer.parseInt(resumo[1]);
    }

    public void setPeso(int peso) {
        this.peso = peso;
        resumo[1] = String.valueOf(this.peso);
    }

    public int getPassos() {
        return Integer.parseInt(resumo[0]);
    }

    public void setPassos(int passos) {
        this.passos = passos;
        resumo[0] = String.valueOf(this.passos);
    }

    public int getAnosPratica() {
        return Integer.parseInt(resumo[7]);
    }

    public void setAnosPratica(int anosPratica) {
        this.anosPratica = anosPratica;
        resumo[7] = String.valueOf(this.anosPratica);
    }

    public int getDataPeso() {
        return Integer.parseInt(resumo[8]);
    }

    public void setDataPeso(int dataPeso) {
        this.dataPeso = dataPeso;
        resumo[8] = String.valueOf(this.dataPeso);
    }

    public String[] getAll(){
        return this.resumo;
    }

    public int getcoposAgua(){
        return Integer.parseInt(resumo[9]);
    }

    public void setcoposAgua(int quantidade){
        this.coposAgua = quantidade;
        resumo[9] = String.valueOf(this.coposAgua);
    }
}
