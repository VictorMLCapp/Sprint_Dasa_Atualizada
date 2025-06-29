/* Projeto Realizado por :
Victor M L Capp - RM 555753
Bruno Carneiro Leão - RM 555563
Paulo Akira Okama - RM 556840
Guilherme da Cunha Melo - RM 555310
Matheus Guishi Morioka - RM 556935
*/

package br.com.dasa.bean;

/**
 * Classe Logradouro é a classe Pai de Sede e Endereço, aqui temos atributos que estão nas duas Classes, rua, cidade, estado e CEP, para facilitar foi criada essa classe Pai
 * @author Victor Capp
 * @version 1.0
 */

public class Logradouro {
    private String rua, cidade, estado, CEP;

    public Logradouro(){
    }

    public Logradouro(String rua, String cidade, String estado, String CEP){
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
