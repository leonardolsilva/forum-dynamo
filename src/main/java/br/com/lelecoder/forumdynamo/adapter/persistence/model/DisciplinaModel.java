package br.com.lelecoder.forumdynamo.adapter.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

@Data
@DynamoDbBean
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DisciplinaModel {

    private String identificadorDisciplina;
    private String nome;
    private String categoria;

    @DynamoDbAttribute("id_disciplina")
    public String getIdentificadorDisciplina() {
        return identificadorDisciplina;
    }

    @DynamoDbAttribute("nome")
    public String getNome() {
        return nome;
    }

    @DynamoDbAttribute("categoria")
    public String getCategoria() {
        return categoria;
    }
}
