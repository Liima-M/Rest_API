package com.matheus.beicinhofoodapi.domain.exception;

public class EntidadeNaoEncontradaException extends RuntimeException{

    public EntidadeNaoEncontradaException(String mensagem){
        super(mensagem);
    }
}
