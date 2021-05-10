package br.com.lelecoder.forumdynamo.core.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Disciplina {

    private String identificadorDisciplina;
    private final String nome;
    private final String categoria;

    public Disciplina(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public static Disciplina of(String nome, String categoria) {
        return new Disciplina(nome, categoria);
    }
}
