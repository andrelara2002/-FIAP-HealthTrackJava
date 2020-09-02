package br.com.fiap.healthtrack;
/**
 * Classe que determina os tipos de esportes
 * que o usuário pratica, como uma parte da
 * classe Usuario.
 * 
 * @author André de Lara RM85856
 * @version 1.0
 */
public class Atleta {
    /**
     * String que vai recuperar os tipos de 
     * esportes armazenados pelo sistema,
     * futuramente será substituido por um
     * array.
     */
    private String esportePraticado;

    /**
     * Recupera os esportes que estão sendo
     * armazenados.
     * 
     * @return Valor armazenado na classe para
     * ser retornado.
     */
    public String getEsportePraticado() {
        return esportePraticado;
    }
    /**
     * 
     * @param esportePraticado
     */
    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }
}
