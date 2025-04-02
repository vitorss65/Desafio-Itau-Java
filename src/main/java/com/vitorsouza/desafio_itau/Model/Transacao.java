package com.vitorsouza.desafio_itau.Model;

import java.time.OffsetDateTime;

public class Transacao {
    private double valor;
    private String descricao;
    private OffsetDateTime dataHora;
    private String categoria;

    public Transacao(double valor, String descricao, OffsetDateTime dataHora, String categoria) {
        this.valor = valor;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.categoria = categoria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
