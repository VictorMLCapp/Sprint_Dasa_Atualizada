/* Projeto Realizado por :
Victor M L Capp - RM 555753
Bruno Carneiro Leão - RM 555563
Paulo Akira Okama - RM 556840
Guilherme da Cunha Melo - RM 555310
Matheus Guishi Morioka - RM 556935
*/

package br.com.dasa.bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Classe Amostra, pegando todas as informações sobre a amostra, id, largura em cm, altura em cm, profundidade em cm, descrição e a data da entrada no sistema dessa amostra, é sobreposta pela interface AmostraVolume
 * @author Victor Capp
 * @version 1.0
 */

public class Amostra implements AmostraVolume {
    private int idAmostra, larguraCm, alturaCm, profundidadeCm;
    private String descricao;
    private int litros;


    public Amostra() {
    }

    public Amostra(int idAmostra, int larguraCm, int alturaCm, String descricao, int profundidadeCm, int litros) {
        this.idAmostra = idAmostra;
        this.larguraCm = larguraCm;
        this.alturaCm = alturaCm;
        this.descricao = descricao;
        this.profundidadeCm = profundidadeCm;
        this.litros = litros;
    }

    public int getIdAmostra() {
        return idAmostra;
    }

    public void setIdAmostra(int idAmostra) {
        this.idAmostra = idAmostra;
    }

    public int getLarguraCm() {
        return larguraCm;
    }

    public void setLarguraCm(int larguraCm) {
        this.larguraCm = larguraCm;
    }

    public int getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(int alturaCm) {
        this.alturaCm = alturaCm;
    }

    public int getProfundidadeCm() {
        return profundidadeCm;
    }

    public void setProfundidadeCm(int profundidadeCm) {
        this.profundidadeCm = profundidadeCm;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    /**
     * Queremos calcular o volume da Amostra
     * @return - vai retornar o volume da amostra
     * @author Victor Capp
     */

    public int calcularVolume() {
        return larguraCm * alturaCm * profundidadeCm;
    }

    /**
     * Calculando o volume em litros da amostra
     * @return - retorna a medida em Litros
     * @author Victor Capp
     */
    public int calcularVolume(int litros){
        return  calcularVolume() / 1000;
    }
}
