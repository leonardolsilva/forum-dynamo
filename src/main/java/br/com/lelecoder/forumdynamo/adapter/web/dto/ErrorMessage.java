package br.com.lelecoder.forumdynamo.adapter.web.dto;

import lombok.Data;

@Data
public class ErrorMessage {

    private final String mensagem;
    private final int statusCode;

    public ErrorMessage(String mensagem, int statusCode) {
        this.mensagem = mensagem;
        this.statusCode = statusCode;
    }

}
