package br.com.lelecoder.forumdynamo.adapter.persistence.mapper;

import br.com.lelecoder.forumdynamo.adapter.persistence.model.AlunoModel;
import br.com.lelecoder.forumdynamo.core.domain.Aluno;
import org.mapstruct.Mapper;

@Mapper
public interface AlunoModelMapper {

    Aluno modelToDominio(AlunoModel alunoModel);

}
