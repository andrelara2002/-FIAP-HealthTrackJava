package br.com.fiap.healthtrack;
/**
 * Classe que mantém os dados que diferenciam
 * os usuários comuns de atletas. herda elementos
 * da classe usuario.
 * 
 * @author André de Lara RM85856
 * @version 1.0
 */
public class Comum extends Usuario{
    private String objetivo;

	public String getObjetivo() {
		return objetivo;
	}

	public void definirObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

    
}
