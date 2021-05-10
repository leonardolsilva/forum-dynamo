package br.com.lelecoder.forumdynamo.adapter.persistence.model;

import br.com.lelecoder.forumdynamo.adapter.persistence.converters.AlunoModelConverter;
import br.com.lelecoder.forumdynamo.adapter.persistence.converters.DisciplinaModelConverter;
import br.com.lelecoder.forumdynamo.adapter.persistence.converters.ListRespostaModelConverter;
import br.com.lelecoder.forumdynamo.core.domain.SituacaoTopico;
import lombok.Builder;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.*;

import java.time.LocalDateTime;
import java.util.List;

@DynamoDbBean
@Builder
@NoArgsConstructor
public class TopicoModel {

    private String identificadorTopico;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private SituacaoTopico status;
    private AlunoModel autor;
    private DisciplinaModel disciplina;
    private List<RespostaModel> respostas;

    @DynamoDbAttribute("id_topico")
    @DynamoDbPartitionKey
    public String getIdentificadorTopico() {
        return identificadorTopico;
    }

    @DynamoDbAttribute("titulo")
    public String getTitulo() {
        return titulo;
    }

    @DynamoDbAttribute("mensagem")
    public String getMensagem() {
        return mensagem;
    }

    @DynamoDbAttribute("data_criacao")
    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    @DynamoDbAttribute("situacao")
    @DynamoDbSortKey
    public SituacaoTopico getStatus() {
        return status;
    }

    @DynamoDbAttribute("autor")
    @DynamoDbConvertedBy(AlunoModelConverter.class)
    public AlunoModel getAutor() {
        return autor;
    }

    @DynamoDbAttribute("disciplina")
    @DynamoDbConvertedBy(DisciplinaModelConverter.class)
    public DisciplinaModel getDisciplina() {
        return disciplina;
    }

    @DynamoDbAttribute("respostas")
    @DynamoDbConvertedBy(ListRespostaModelConverter.class)
    public List<RespostaModel> getRespostas() {
        return respostas;
    }
}
