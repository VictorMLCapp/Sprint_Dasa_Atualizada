package br.com.dasa.bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AmostraRecente {
    private LocalDate dataEntrada;

    public AmostraRecente(){}

    public AmostraRecente(LocalDate dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * Verifica se a amostra é recente com base em uma data de entrada e um limite de dias.
     * Esse metodo compara manualmente, dia a dia, a diferença entre a data de entrada e a data atual.
     * @return true se a amostra tiver sido registrada há menos dias que o limite informado, false caso contrário
     * @author Victor Capp
     */

    public boolean amostraRecente(int dias) {
        return java.time.temporal.ChronoUnit.DAYS.between(dataEntrada, java.time.LocalDate.now()) < dias;
    }

    public String classificarAmostra() {
        long dias = ChronoUnit.DAYS.between(dataEntrada, LocalDate.now());
        if (dias < 180) return "RECENTE";
        else if (dias <= 365) return "MEDIANA";
        else return "ANTIGA";
    }
}


