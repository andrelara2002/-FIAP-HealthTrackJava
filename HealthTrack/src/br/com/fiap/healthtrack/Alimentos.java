package br.com.fiap.healthtrack;

import java.util.Calendar;

public class Alimentos {
    private String nome;
    private int calorias;
    private Calendar data;

    public Alimentos(){}

    public Alimentos(String nome, int calorias, Calendar data){
        super();
        this.nome = nome;
        this.calorias = calorias;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    
}
