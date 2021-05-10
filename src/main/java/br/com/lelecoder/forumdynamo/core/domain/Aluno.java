package br.com.lelecoder.forumdynamo.core.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Aluno {

    private String identificadorAluno;
    private final String nome;
    private final String email;
    private final int idade;

    public Aluno(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public static Aluno of(String nome, String email, int idade) {
        return new Aluno(nome, email, idade);
    }
}
