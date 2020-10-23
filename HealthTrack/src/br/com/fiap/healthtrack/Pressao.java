package br.com.fiap.healthtrack;

import java.util.Calendar;

public class Pressao{
    int pressaoSistolica;
    int pressaoDiastolica;
    Calendar dt_pressao;

    public Pressao(){}
    public Pressao(int pressaoSistolica, int pressaoDiastolica, Calendar dt_pressao){
        this.pressaoDiastolica = pressaoDiastolica;
        this.pressaoSistolica = pressaoSistolica;
        this.dt_pressao = dt_pressao;
    }
	public int getPressaoSistolica() {
		return pressaoSistolica;
	}
	public void setPressaoSistolica(int pressaoSistolica) {
		this.pressaoSistolica = pressaoSistolica;
	}
	public int getPressaoDiastolica() {
		return pressaoDiastolica;
	}
	public void setPressaoDiastolica(int pressaoDiastolica) {
		this.pressaoDiastolica = pressaoDiastolica;
	}
	public Calendar getDt_pressao() {
		return dt_pressao;
	}
	public void setDt_pressao(Calendar dt_pressao) {
		this.dt_pressao = dt_pressao;
	}
    
}