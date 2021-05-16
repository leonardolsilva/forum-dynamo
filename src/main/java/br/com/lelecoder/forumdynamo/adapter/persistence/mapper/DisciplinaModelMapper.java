package br.com.lelecoder.forumdynamo.adapter.persistence.mapper;

import br.com.lelecoder.forumdynamo.adapter.persistence.model.DisciplinaModel;
import br.com.lelecoder.forumdynamo.core.domain.Disciplina;
import org.mapstruct.Mapper;

@Mapper
public interface DisciplinaModelMapper {

    Disciplina modelToDomino(DisciplinaModel disciplinaModel);
}
