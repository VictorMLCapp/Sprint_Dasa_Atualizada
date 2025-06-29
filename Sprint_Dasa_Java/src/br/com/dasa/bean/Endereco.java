/* Projeto Realizado por :
Victor M L Capp - RM 555753
Bruno Carneiro Leão - RM 555563
Paulo Akira Okama - RM 556840
Guilherme da Cunha Melo - RM 555310
Matheus Guishi Morioka - RM 556935
*/

package br.com.dasa.bean;

/**
 * Classe Endereco, pegando todas as informalçoes de endereço, classe filho de Logradouro pois outra classe ( Sede ) tem alguns mesmos atributos
 * @author Victor Capp
 * @version 1.0
 */

public class Endereco extends Logradouro{
    private String complemento;
    private int numero;

    public Endereco(){
    }

    public Endereco(String rua, String cidade, String estado, String CEP, String complemento, int numero){
        super.setRua(rua);
        super.setCidade(cidade);
        super.setEstado(estado);
        super.setCEP(CEP);
        this.complemento = complemento;
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
