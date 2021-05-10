package br.com.lelecoder.forumdynamo.core.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Builder
@Getter
public class Topico {

    private String identificadorTopico;
    private final String titulo;
    private final String mensagem;
    private final LocalDateTime dataCriacao;
    private final SituacaoTopico status;
    private final Aluno autor;
    private final Disciplina disciplina;
    private List<Resposta> respostas;

    public Topico(String titulo, String mensagem, Aluno autor, Disciplina disciplina) {
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.dataCriacao = LocalDateTime.now();
        this.status =  SituacaoTopico.NAO_RESPONDIDO;
        this.autor = autor;
        this.disciplina = disciplina;
    }

    public static Topico of(String titulo, String mensagem, Aluno autor, Disciplina disciplina) {
        return new Topico(titulo, mensagem, autor, disciplina);
    }

    public Optional<Resposta> getRespostaSolucionadora() {
        return this.respostas
                .stream()
                .filter(Resposta::isSolucao)
                .findFirst();
    }

    public void adicionarResposta(Resposta resposta) {
        this.respostas.add(resposta);
    }
}