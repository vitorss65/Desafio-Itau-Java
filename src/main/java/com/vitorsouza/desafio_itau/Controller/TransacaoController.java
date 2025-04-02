package com.vitorsouza.desafio_itau.Controller;

import java.time.OffsetDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitorsouza.desafio_itau.Model.Transacao;
import com.vitorsouza.desafio_itau.Repository.TransacaoRepository;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    //Construtor e atributo final da classe Repositório
    private final TransacaoRepository transacaoRepository;
    
    public TransacaoController(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    //Método para criar uma transação
    @PostMapping
    public ResponseEntity<Transacao> criarTransacao(@RequestBody Transacao transacao) {
        //Validar o valor da transação para certificar que é maior que zero
        if (transacao.getValor() <=0) {
            return ResponseEntity.badRequest().build(); //Retorna um erro 400
        }
        //Valida se a data da transação é futura
        if (transacao.getDataHora().isAfter(OffsetDateTime.now())) {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build(); //Retorna um erro 422
        }

        transacaoRepository.save(transacao);
        return ResponseEntity.ok(transacao); 
    }
    
}
