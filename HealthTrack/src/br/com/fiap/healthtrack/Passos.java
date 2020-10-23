package br.com.fiap.healthtrack;

import java.sql.Date;
import java.util.Calendar;

public class Passos {
    private int passos;
    private Calendar dt_passos;

    public Passos(int passos, Calendar dt_passos){
        this.passos = passos;
        this.dt_passos = dt_passos;
    }
    public Passos(){}

    public int getPassos() {
        return passos;
    }

    public void setPassos(int passos) {
        this.passos = passos;
    }

    public Calendar getDt_passos() {
        return dt_passos;
    }

    public void setDt_passos(Calendar dt_passos) {
        this.dt_passos = dt_passos;
    }
}
