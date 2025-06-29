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
    private int id_sede;
    private String nome_unidade, num_tel;

    public Sede(){
    }

    public Sede(String rua, String cidade, String estado, String CEP, int id_sede, String num_tel, String nome_unidade){
        super.setRua(rua);
        super.setCidade(cidade);
        super.setEstado(estado);
        super.setCEP(CEP);
        this.id_sede = id_sede;
        this.num_tel = num_tel;
        this.nome_unidade = nome_unidade;
    }

    public int getId_sede() {
        return id_sede;
    }

    public void setId_sede(int id_sede) {
        this.id_sede = id_sede;
    }

    public String getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }

    public String getNome_unidade() {
        return nome_unidade;
    }

    public void setNome_unidade(String nome_unidade) {
        this.nome_unidade = nome_unidade;
    }
}


