package br.com.fiap.healthtrack;
/**
 * Classe que determina os tipos de esportes
 * que o usuário pratica, herda atributos
 * da classe usuário.
 * 
 * @author André de Lara RM85856
 * @version 1.0
 */
public class Atleta extends Usuario{
    /**
     * String que vai recuperar os tipos de 
     * esportes armazenados pelo sistema,
     * futuramente será substituido por um
     * array.
     */
    private String esportePraticado;
    /**
     * int que vai recuperar o período
     * que o usuário pratica tal esporte
     */
    private int tempoDePratica;
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
    public void adicionarEsporte(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }
    /**
     * 
     * @return
     */
    public int getTempoDePratica() {
        return tempoDePratica;
    }

    public void adicionarTempo(int tempoDePratica) {
        this.tempoDePratica = tempoDePratica;
    }
}
