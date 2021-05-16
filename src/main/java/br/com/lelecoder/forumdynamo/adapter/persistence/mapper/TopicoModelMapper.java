package br.com.lelecoder.forumdynamo.adapter.persistence.mapper;

import br.com.lelecoder.forumdynamo.adapter.persistence.model.TopicoModel;
import br.com.lelecoder.forumdynamo.core.domain.Topico;
import org.mapstruct.Mapper;

@Mapper
public interface TopicoModelMapper {

    Topico modelToDominio(TopicoModel topicoModel);

}
