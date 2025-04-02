package com.vitorsouza.desafio_itau.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vitorsouza.desafio_itau.Model.Transacao;

@Repository
public class TransacaoRepository {
    private List<Transacao> transacoes = new ArrayList<>();

    public List<Transacao> findAll() {
        return transacoes;
    }

    public void save(Transacao transacao) {
        transacoes.add(transacao);
    }
}
