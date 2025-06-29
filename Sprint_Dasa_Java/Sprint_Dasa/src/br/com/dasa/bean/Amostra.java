/* Projeto Realizado por :
Victor M L Capp - RM 555753
Bruno Carneiro Leão - RM 555563
Paulo Akira Okama - RM 556840
Guilherme da Cunha Melo - RM 555310
Matheus Guishi Morioka - RM 556935
*/

package br.com.dasa.bean;

import java.time.LocalDate;

/**
 * Classe Amostra, pegando todas as informações sobre a amostra, id, largura em cm, altura em cm, profundidade em cm, descrição e a data da entrada no sistema dessa amostra, é sobreposta pela interface AmostraVolume
 * @author Victor Capp
 * @version 1.0
 */

public class Amostra implements AmostraVolume{
    private int id_amostra, largura_cm, altura_cm, profundidade_cm;
    private String descricao;
    private LocalDate data_entrada;

    public Amostra(){
    }

    public Amostra(int id_amostra, int largura_cm, int altura_cm, int profundidade_cm, String descricao, LocalDate data_entrada){
        this.id_amostra = id_amostra;
        this.largura_cm = largura_cm;
        this.altura_cm = altura_cm;
        this.profundidade_cm = profundidade_cm;
        this.descricao = descricao;
        this.data_entrada = data_entrada;
    }

    public int getId_amostra() {
        return id_amostra;
    }

    public void setId_amostra(int id_amostra) {
        this.id_amostra = id_amostra;
    }

    public int getLargura_cm() {
        return largura_cm;
    }

    public void setLargura_cm(int largura_cm) {
        this.largura_cm = largura_cm;
    }

    public int getAltura_cm() {
        return altura_cm;
    }

    public void setAltura_cm(int altura_cm) {
        this.altura_cm = altura_cm;
    }

    public int getProfundidade_cm() {
        return profundidade_cm;
    }

    public void setProfundidade_cm(int profundidade_cm) {
        this.profundidade_cm = profundidade_cm;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData_entrada() {
        return data_entrada;
    }

    /**
     * Pegar a data que a amostra entrou no sistema
     * @param data_entrada - através do localdate.now irá ser implementado no sistema para maior organização
     * @author Victor Capp
     */

    public void setData_entrada(LocalDate data_entrada) {
        this.data_entrada = data_entrada;
    }

    /**
     * Queremos calcular o volume da Amostra
     * @param volume - pegamos o volume da amostra fazendo a conta com largura, profundidade ealtura
     * @return - vai retornar o volume da amostra
     * @author Victor Capp
     */

    public int calcularVolume(float volume){
        return 0;
    }
}
