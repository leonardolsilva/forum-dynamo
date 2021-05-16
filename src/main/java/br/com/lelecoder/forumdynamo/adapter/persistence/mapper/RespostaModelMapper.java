package br.com.lelecoder.forumdynamo.adapter.persistence.mapper;

import br.com.lelecoder.forumdynamo.adapter.persistence.model.RespostaModel;
import br.com.lelecoder.forumdynamo.core.domain.Resposta;
import org.mapstruct.Mapper;

@Mapper
public interface RespostaModelMapper {

    Resposta modelToDominio(RespostaModel respostaModel);
}
