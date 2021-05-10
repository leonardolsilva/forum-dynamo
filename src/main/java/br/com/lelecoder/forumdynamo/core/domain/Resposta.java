package br.com.lelecoder.forumdynamo.core.domain;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@RequiredArgsConstructor
public class Resposta {

    private String identificadorResposta;
    private final String texto;
    private final Topico topico;
    private final LocalDateTime dataCriacao;
    private final Aluno aluno;
    private boolean solucao;

    public Resposta(String texto, Topico topico, Aluno aluno) {
        this.texto = texto;
        this.topico = topico;
        this.aluno = aluno;
        this.dataCriacao = LocalDateTime.now();
    }

    public void marcarRespostaSolucionada() {
        this.solucao = true;
    }

    public boolean isSolucao() {
        return solucao;
    }
}
