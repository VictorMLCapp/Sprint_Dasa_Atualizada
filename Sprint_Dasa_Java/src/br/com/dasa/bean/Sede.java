/* Projeto Realizado por :
Victor M L Capp - RM 555753
Bruno Carneiro Leão - RM 555563
Paulo Akira Okama - RM 556840
Guilherme da Cunha Melo - RM 555310
Matheus Guishi Morioka - RM 556935
*/

package br.com.dasa.bean;

/**
 * Classe Sede é a classe filha de logradouro, classe que pega informações da sede onde foram retiradas as amostras, queremos saber o endereçi do local e onde fica, atributos: id_sede, num_tel, nome_unidade
 * @author Victor Capp
 * @version 1.0
 */
public class Sede extends Logradouro{
    private String nomeUnidade, numTel;

    public Sede(){
    }

    public Sede(String rua, String cidade, String estado, String CEP, String numTel, String nomeUnidade){
        super.setRua(rua);
        super.setCidade(cidade);
        super.setEstado(estado);
        super.setCEP(CEP);
        this.numTel = numTel;
        this.nomeUnidade = nomeUnidade;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getNomeUnidade() {
        return nomeUnidade;
    }

    public void setNomeUnidade(String nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
    }
}


